package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午6:50:29
 * @version 1.0
 */
public class EagerSingleton implements Cloneable, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final EagerSingleton INSTANCE = new EagerSingleton();
	
	private EagerSingleton(){
		if(INSTANCE != null){
			throw new IllegalStateException("单例模式只可以初始化一次");
		}
	}
	
	public static EagerSingleton getInstance(){
		return INSTANCE;
	}
	
	/**
	 * 单例禁止clone
	 * */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException("单例模式禁止拷贝");
	}
	
	/**
	 * 反序列化时直接返回单例，防止破坏
	 * */
	private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerSingleton instance = EagerSingleton.getInstance();
		System.out.println(instance);
	}

}
/**
 * 懒汉模式，一来就加载，线程安全,可以防范clone、多线程、反序列化，反射等破坏
 * 但是一来就加载，不使用时浪费内存
 * */
