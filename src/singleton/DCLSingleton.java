package singleton;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午7:05:15
 * @version 1.0
 */
public class DCLSingleton {
	private volatile static DCLSingleton INSTANCE;
	private DCLSingleton(){
		
	}
	public static DCLSingleton getInstance(){
		if(INSTANCE == null){
			synchronized (DCLSingleton.class) {
				if(INSTANCE == null){
					INSTANCE = new DCLSingleton();
				}
			}
		}
		return INSTANCE;
	}
}
/**
 * 双重锁定检测单例模式，线程安全的，
 * 注意在1.5之后才有效，16行中的new 分为3步：
 * 1）分配内存；
 * 2）初始化；
 * 3）赋值给引用
 * 其中 2）、3）两步不定，防止另一个线程得到一个未完全初始化的实例，使用volatile
 * */

