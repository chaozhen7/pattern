package decorator;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午11:07:15
 * @version 1.0
 */
public class Car implements Transform {
	public Car(){
		System.out.println("car init");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("car move");
	}

}
