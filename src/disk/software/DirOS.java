package disk.software;
/**
 * 
 * @author Zhanbiao_Zhu
 *
 */
public interface DirOS {
	/**
	 * 新建目录
	 * @param path
	 * @return
	 */
	public boolean md(String path);
	/**
	 * 显示目录下的文件和目录
	 * 想当于dir命令
	 * @param path
	 * @return
	 */
	public boolean dir(String path);
	/**
	 * 删除一个空目录
	 * -->我们要实现一个删除非空目录的扩张功能
	 * @param path
	 * @return
	 */
	public boolean rd(String path);
	/**
	 * 格式化磁盘
	 * @return
	 */
	public boolean format();
}
