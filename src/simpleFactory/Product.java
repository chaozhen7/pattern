package simpleFactory;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午7:33:14
 * @version 1.0
 */
public abstract class Product {
	public void methodSame(){
		System.out.println("公共方法");
	}
	public abstract void methodDiff();
}
