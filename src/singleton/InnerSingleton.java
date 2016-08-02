package singleton;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午7:10:26
 * @version 1.0
 */
public class InnerSingleton {
	public InnerSingleton getInstance(){
		return Holder.INSTANCE;
	}
	private static class Holder{
		private final static InnerSingleton INSTANCE = new InnerSingleton();
	}
	private InnerSingleton(){
		
	}
}
/**
 * 使用静态内部类 使用时再初始化，利用jdk内部机制，保证线程安全
 * 
 * */
 