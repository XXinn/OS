package memory.hardware;

import myUtil.Number;

/**
 * 用户区，大小为512字节
 * @author suisui
 *
 */

/**
 * 补充：
 * 用户区 的单位是字节
 * 一共又512个字节
 * 当文件打开或者运行的时候，调度分配算法
 * 分配成功够文件的字节流存储到用户区
 * 分配失败返回错误
 * @author Zhanbiao_Zhu
 *
 */
public class UserArea {
	public int getMaxSize() {
		return maxSize;
	}
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	public byte[] getMemory() {
		return memory;
	}
	public void setMemory(byte[] memory) {
		this.memory = memory;
	}
	private int maxSize = Number.sizeOfUserArea;
	private byte[] memory = new byte[maxSize];
	public UserArea() {

	}
}
