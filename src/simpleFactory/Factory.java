package simpleFactory;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午7:36:14
 * @version 1.0
 */
public class Factory {
	public static Product getProduct(String arg) {
		Product product = null;
		if (arg.equalsIgnoreCase("A")) {
			product = new ProductA();
		} else if (arg.equalsIgnoreCase("B")) {
			product = new ProductB();
		}
		return product;
	}

}
