package factoryMethod;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午7:52:22
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory;
		factory = new FactoryA();
		Product productA = factory.factoryMethod();
		factory = new FactoryB();
		Product productB = factory.factoryMethod();
	}

}
