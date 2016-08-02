package singleton;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午7:02:07
 * @version 1.0
 */
public class LazySingleton {
	private static LazySingleton instance;
	private LazySingleton(){
		
	}
	
	public synchronized LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}
/**
 * 线程安全,可以改进,缩小synchronized范围
 * */
