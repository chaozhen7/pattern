package decorator;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午11:08:43
 * @version 1.0
 */
public class Airplane extends Change {

	public Airplane(Transform transform) {
		super(transform);
		// TODO Auto-generated constructor stub
		System.out.println("airplane init");
	}
	public void move(){
		super.move();
		fly();
	}
	public void fly(){
		System.out.println("fly ");
	}

}
