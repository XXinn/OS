package device;
import memory.hardware.PCB;
import process.hardware.*;
import process.software.*;
import process.software.Process;
import process.software.impl.Controller;

public class EquipmentOS {
	/*
	 * 设备管理
	 */
	public void apply(PCB pcb,Equipment num,int time){
		//申请设备
		WaitProcess value = new WaitProcess(pcb, time);
		if(num.getNumOfDevice()==0 || num.waitList.isEmpty()==false){
			num.waitList.add(value);
		}else if(num.getNumOfDevice()>0){
			for(int i=0;i<num.getDmts().length;i++){
				if(num.dmts[i].getStatus()==0){
					//有空闲设备就从等待队列移除队首
					num.dmts[i].setStatus(1);
					num.setNumOfDevice(num.getNumOfDevice()-1);
					num.dmts[i].useDevice(pcb, time);
					/*
					 * 使用
					 */
					num.dmts[i].setStatus(0);
					num.setNumOfDevice(num.getNumOfDevice()+1);
					finish(num,pcb);

				}
			}
		}
	}

	public void finish(Equipment value,PCB pcb){
		//设备运行结束
		Process mothod = new Process();
		mothod.awake(pcb);//释放进程
		if(!value.waitList.isEmpty()){
			//检查等待序列是否有进程
			WaitProcess mode = value.waitList.remove();
			PCB otherpcb = mode.getPcb();
			int time = mode.getTime();
			apply(otherpcb,value,time);
		}
	}
}
