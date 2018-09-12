package device;

import memory.hardware.PCB;

public class WaitProcess {
	/*
	 * 等待信息块，以整个放进等待序列
	 */
	private PCB pcb;
	private int time = 0;
	public PCB getPcb() {
		return pcb;
	}
	public void setPcb(PCB pcb) {
		this.pcb = pcb;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

	public WaitProcess(PCB pcb,int time){
		//把进程存进等待序列
		this.pcb = pcb;
		this.time = time;
	}
}
