package memory.hardware;


public class PCB {

	private int id;  //不知做什么用
	private int state; //进程状态0就绪，1阻塞，2完成
	private int priority;  //优先级
	private int runnedTime;  //运行的时间
	private int waitedTime;  //等待的时间

	private int ax; 
	private int psw; 
	private int pc;
	private int  ir;
	private long pid;
	//进程在内存的位置
	private long startPos; //start代表起点
	private long length; //length代表这个进程的大小

	public PCB(int id, int state, int ax, int psw, int pc, int ir, long startPos, long length) {
		super();
		this.id = id;
		this.state = state;
		this.ax = ax;
		this.psw = psw;
		this.pc = pc;
		this.ir = ir;
		this.startPos = startPos;
		this.length = length;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getRunnedTime() {
		return runnedTime;
	}
	public void setRunnedTime(int runnedTime) {
		this.runnedTime = runnedTime;
	}
	public int getWaitedTime() {
		return waitedTime;
	}
	public void setWaitedTime(int waitedTime) {
		this.waitedTime = waitedTime;
	}
	public int getAx() {
		return ax;
	}
	public void setAx(int ax) {
		this.ax = ax;
	}
	public int getPsw() {
		return psw;
	}
	public void setPsw(int psw) {
		this.psw = psw;
	}
	public int getPc() {
		return pc;
	}
	public  int  getIr() {
		return ir;
	}
	public void setIr(int  ir) {
		this.ir = ir;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}

}
