package process.hardware;
import memory.hardware.PCB;

public class Process {
	private PCB pcb;
	public void create() {
		pcb = new PCB();
		
	}
	
	//销毁进程
	public void destroy() {
		
	}
	

	//阻塞该进程
	public void block() {
		
	}
	
	//唤醒进程
	public void awake() {
		
	}

	public PCB getPcb() {
		return pcb;
	}
	
	public void setPcb(PCB pcb) {
		this.pcb = pcb;
	}

}

