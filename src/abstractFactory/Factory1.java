package abstractFactory;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午8:04:17
 * @version 1.0
 */
public class Factory1 implements AbstractFactory {

	@Override
	public AbstractProductA productA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	@Override
	public AbstractProductB productB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
