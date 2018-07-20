package disk.software;
/**
 * 利用接口避免耦合
 * 
 * @author Zhanbiao_Zhu
 *
 */
public interface FileOS {
	/**
	 * 创建文件的路径+名字
	 * 还有文件的属性
	 * @param filename
	 * @param attribute
	 * @return
	 */
	public boolean create_file(String filename,int attribute);
	
	/**
	 * 打开文件的名字和打开的方式（读或者写）
	 * @param name
	 * @param kind
	 * @return
	 */
	public boolean open_file(String name,int kind);
	/**
	 * 读取length个字节
	 * （其实不知道有什么作用）
	 * @param name
	 * @param length
	 * @return
	 */
	public boolean read_file(String name,int length);
	/**
	 * 写入length个字节
	 * （其实不知道有什么作用）
	 * @param name
	 * @param length
	 * @return
	 */
	public boolean write_file(String name,int length);
	public boolean closse_file(String name);
	public boolean delete_file(String name);
	/**
	 * 显示文件的内容
	 * @param name
	 * @return
	 */
	public boolean typef_file(String name);
	public boolean change(String name);
	/**
	 * 运行可执行文件
	 * @param name
	 * @return
	 */
	public boolean execute(String name);

}
