package memory.hardware;

/**
 * 系统区
 * 
 * @author suisui
 *
 */
public class SystemArea {
	private PCB[] pcb;// 最多10个PCB
	private MemoryTable memoryTable;
	public SystemArea() {
		memoryTable=new MemoryTable();
	}
	public PCB[] getPcb() {
		return pcb;
	}
	public void setPcb(PCB[] pcb) {
		this.pcb = pcb;
	}
	public MemoryTable getMemoryTable() {
		return memoryTable;
	}
	public void setMemoryTable(MemoryTable memoryTable) {
		this.memoryTable = memoryTable;
	}
}
