package process.software;

public interface ProcessOS {
	public boolean create();
	public void destory(long pid);
	public void block(long pid);
	public void awake(long pid);
}
