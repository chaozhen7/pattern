package adapter;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午8:49:55
 * @version 1.0
 */
public class AdaptorClass extends Target implements Adaptee {

	@Override
	public void realFun() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		realFun();
	}

}
/**
 * 类模式 实现具体的类来适配
 * */
