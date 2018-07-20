package disk.hardware;

import javax.xml.stream.events.StartDocument;

public class FileStruct {
	private String name; //限定3字节
	private String type; //限定一个字节 文本的拓展名是t 可运行文件的拓展名是e 目录没有拓展名
	private byte fileAttribute; //限定一个字节
	private byte startPos; //限定一个字节
	private short fileLength; //限定两个字节
}
