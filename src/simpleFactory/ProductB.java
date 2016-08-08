package simpleFactory;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午7:34:28
 * @version 1.0
 */
public class ProductB extends Product {

	@Override
	public void methodDiff() {
		// TODO Auto-generated method stub
		System.out.println("产品B产生了");
	}
	public ProductB(){
		methodSame();
		methodDiff();
	}

}
