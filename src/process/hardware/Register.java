package process.hardware;

public class Register {
	
	private int ax;//存放数据x的值
	private int psw;//程序状态
	private int pc;//程序计数器，计算做到第几步
	private int ir;//指令寄存器
	
	
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
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int getIr() {
		return ir;
	}
	public void setIr(int ir) {
		this.ir = ir;
	}
	
}

