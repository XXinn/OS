package memory.hardware;

import java.util.LinkedList;

import myUtil.Number;

/**
 * 内存分配表
 * 
 * @author suisui
 *
 */
public class MemoryTable{
	private int memSize;// 内存大小
	private LinkedList<Zone> freeZones;// 空闲分区
	private int pointer;// 上次分配的空闲区位置
	public MemoryTable() {
		this.memSize = 1024;// 默认内存大小  
		this.pointer = 0;
		this.freeZones = new LinkedList<>();
		freeZones.add(new Zone(0, this.memSize));
	}

	public MemoryTable(int memSize) {
		this.memSize = memSize;
		this.pointer = 0;
		this.freeZones = new LinkedList<>();
		freeZones.add(new Zone(0, this.memSize));
	}

	public int getMemSize() {
		return memSize;
	}

	public void setMemSize(int memSize) {
		this.memSize = memSize;
	}

	public LinkedList<Zone> getFreeZones() {
		return freeZones;
	}

	public void setFreeZones(LinkedList<Zone> freeZones) {
		this.freeZones = freeZones;
	}

	public int getPointer() {
		return pointer;
	}

	public void setPointer(int pointer) {
		this.pointer = pointer;
	}
}
