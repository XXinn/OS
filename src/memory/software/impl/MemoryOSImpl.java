package memory.software.impl;

import memory.hardware.MemoryTable;
import memory.hardware.PCB;
import memory.hardware.Zone;
import memory.software.MemoryOS;

public class MemoryOSImpl implements MemoryOS {
	/**
	 * 内存分配
	 * @param size 申请内存大小
	 */
	private MemoryTable memoryTable;
	public boolean allocation(byte[]data) {
		int size = data.length;
		firstFit(size);//默认首次适配
		return true;
	}
	/**
	 * 内存回收
	 * @param pid 释放进程标志符为pid进程所占用的内存
	 */
	public void collection(long pid) {
		
	}
	
	/**
	 * 首次适配
	 * @param size 申请内存大小
	 */
	private void firstFit(int size) {
		
	}
	
	/**
	 * 下次适配
	 * 
	 * @param size
	 */
	private void nextFit(int size) {

	}

	/**
	 * 最佳适配
	 * 
	 * @param size
	 */
	private void bestFit(int size) {

	}

	/**
	 * 最差适配
	 * 
	 * @param size
	 */
	private void worstFit(int size) {

	}
	@Override
	public PCB[] getPCB() {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(int size) {
		for (Zone zone : memoryTable.getFreeZones()) {
			//遍历空闲链表
		}
	}

	public void remove() {
		
	}
}
