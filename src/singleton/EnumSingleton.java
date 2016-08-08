package singleton;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午6:48:23
 * @version 1.0
 */
public enum EnumSingleton {
	INSTANCE;
	
	private EnumSingleton(){
		
	}
}
/**
 * 使用方式：EnumSingleton.INSTANCE
 * 最安全的单例模式，可以防范反射、反序列化、clone、多线程等的破坏，推荐使用
 */