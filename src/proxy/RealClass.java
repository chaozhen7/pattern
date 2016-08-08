package proxy;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月8日 下午7:40:00
 * @version 1.0
 */
public class RealClass implements ProxyInterface {

	@Override
	public void func() {
		// TODO Auto-generated method stub
		System.out.println("real func run ..");
	}

}
