package memory.software;

import memory.hardware.PCB;

public interface MemoryOS {
	public boolean allocation(byte[]data);
	public void collection(long pid);
	public PCB[] getPCB();
}
