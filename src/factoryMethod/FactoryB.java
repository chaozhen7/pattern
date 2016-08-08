package factoryMethod;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午7:51:31
 * @version 1.0
 */
public class FactoryB implements Factory {

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ProductB();
	}

}
