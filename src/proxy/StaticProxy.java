package proxy;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月8日 下午7:40:40
 * @version 1.0
 */
public class StaticProxy implements ProxyInterface {
	private ProxyInterface realInstance = new RealClass();
	@Override
	public void func() {
		// TODO Auto-generated method stub
		System.out.println("before ..");
		realInstance.func();
		System.out.println("after ..");
	}

}
