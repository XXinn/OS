package disk.software.impl;

import org.junit.Test;

import disk.hardware.Disk;
import disk.hardware.DiskBlock;
import disk.hardware.FAT;
import disk.software.DiskManager;
import myUtil.Number;

public class DiskManagerImpl implements DiskManager{

	private DiskOS diskOS = new DiskOS();
	@Override
	public int getFreeBlockPos() {
		// TODO Auto-generated method stub
		FAT fat=diskOS.getFatTable();
		byte [] fatItem=fat.getFatItem();
		for(int i =4;i<fatItem.length;i++) {
			if(Number.byteToInt(fatItem[i])==0) {
					return i;
			}
		}
		return -1;
	}

	@Override
	public int getFreeBlockNum() {
		// TODO Auto-generated method stub
		FAT fat=diskOS.getFatTable();
		byte [] fatItem=fat.getFatItem();
		int ans=0;
		for(int i =0;i<fatItem.length;i++) {
			if(Number.byteToInt(fatItem[i])==0) {
					ans++;
			}
		}
		return ans;
	}
	@Override
	public boolean isEnoughBlock(byte[] file) {
		int len=file.length/64+1;
		if(len>=getFreeBlockNum()) {
			return true;
		}else
		return false;
	}
	@Override
	public int storeFile(byte[] file) {
		// TODO Auto-generated method stub
		/**
		 * 存取数据的时候去fat表查找适合的空间将数据放进磁盘
		 * 无论如何一定会占用一个块磁盘
		 * 
		 */
		int startPos;
		int last;
		int pos;
		int wp=0; //写指针
		int remain = file.length;
		int len = file.length;
		Disk disk = diskOS.getDisk();
		DiskBlock diskBlock[] =disk.getDisk();
		byte [] fatItem=diskOS.getFatTable().getFatItem();
		//无论如何都需要占用一块内存然后初分配
		//初分配如果不够需要更多的块构成链表
		startPos = last = pos = getFreeBlockPos();
		fatItem[pos]=-1; //假设只有一块
		int times=remain;
		for(int i=0;i<Math.min(times,64);i++) {
			diskBlock[pos].getDiskblock()[i] = file[wp];
			wp++;
			remain--;
		}
		//再分配
		for(int i=0;i<len/64;i++) {
			pos = getFreeBlockPos();
			fatItem[last] =Number.intToByte(pos);
			last = pos;
			times=remain;
			for(int j =0;j<Math.min(times,64);j++) {
				diskBlock[pos].getDiskblock()[j] = file[wp];
				wp++;
				remain--;
			}
		}
		fatItem[pos]=-1;
		return startPos;
	}
	@Override
	public byte[] getFile(int start,int len) {
		// TODO Auto-generated method stub
		
		int pos=start;
		int remain = len;
		int rp=0;//读取指针用于定位
		byte []ans = new byte[len];
		byte []fat = diskOS.getFatTable().getFatItem();
		DiskBlock[] diskBlock = diskOS.getDisk().getDisk();
		while(pos!=255) {
			int time=remain;
			for(int j=0;j<Math.min(64,time);j++) {
				ans[rp] =diskBlock[pos].getDiskblock()[j]; 
				rp++;
				remain--;
			}
			pos = Number.byteToInt(fat[pos]);
		}
		return ans;
	}
}
