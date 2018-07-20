package disk.software;
/**
 * 磁盘空间管理
 * 连接文件和磁盘
 * 将文件存储到磁盘
 * 会调用磁盘的存取
 * 将文件byte分别存放到block中
 * @author Zhanbiao_Zhu
 *
 */
public interface DiskManager {
	public int getFreeBlockPos();
	public int getFreeBlockNum();
	public boolean isEnoughBlock();
	public void storeFile(byte[]file);
	public byte[] getFile();
}
