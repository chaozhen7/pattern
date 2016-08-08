package simpleFactory;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午7:34:28
 * @version 1.0
 */
public class ProductA extends Product {

	@Override
	public void methodDiff() {
		// TODO Auto-generated method stub
		System.out.println("产品A产生了");
	}
	
	public ProductA(){
		methodSame();
		methodDiff();
	}

}
