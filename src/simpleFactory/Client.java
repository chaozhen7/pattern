package simpleFactory;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午7:39:27
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product;
		product = Factory.getProduct("A"); //通过工厂类创建产品对象 product.methodSame();
	}

}
