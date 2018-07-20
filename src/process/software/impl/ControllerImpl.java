package process.software.impl;


import java.util.LinkedList;
import java.util.Queue;

import device.Equipment;
import memory.hardware.PCB;
import process.hardware.Register;

public class ControllerImpl {
	//时间片
	public static int systemTime = 0;
	public static int runTime = 1;
	public static int equipmentTime = 1;
	//公用寄存器组
	public static Register register = new Register();
	//PCB队列、就绪、阻塞、空白
	public static Queue<PCB> readyProcess = new LinkedList<>();
	public static Queue<PCB> blockProcess = new LinkedList<>();
	public static Queue<PCB> blankProcess = new LinkedList<>();
	//设备管理
	public static Equipment equipments = new Equipment();
	
	public ControllerImpl() {
		
	}
	
	//一步步执行进程
	public void CPU() {
		systemTime++;
		//equipmentTime--; //wrong
		runTime--;
	}
}
