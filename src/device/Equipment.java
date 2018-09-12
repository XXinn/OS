package device;

import java.util.LinkedList;
import java.util.Queue;

import org.omg.CORBA.PUBLIC_MEMBER;

import memory.hardware.PCB;

/**
 *
 * @author Xin
 *
 */
public class Equipment {
	/*
	 * 每个设备有一个设备分配表和一个等待序列
	 */
	private int numOfDevice;
	public DMT[] dmts;//设备分配表
	public Queue<WaitProcess> waitList = new LinkedList<>();//等待序列


	public DMT[] getDmts() {
		return dmts;
	}

	public int getNumOfDevice() {
		return numOfDevice;
	}

	public void setNumOfDevice(int numOfDevice) {
		this.numOfDevice = numOfDevice;
	}

	public Equipment(int num){
		//初始同类设备的数量
		DMT[] value = new DMT[num];
		this.dmts = value;
		this.numOfDevice=num;
	}

}
