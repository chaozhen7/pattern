package abstractFactory;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午8:07:44
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory factory1 = new Factory1();
		AbstractProductA productA1 = factory1.productA();
		AbstractProductB productB1 = factory1.productB();
	}

}
