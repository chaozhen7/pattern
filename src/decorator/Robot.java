package decorator;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午11:09:53
 * @version 1.0
 */
public class Robot extends Change {

	public Robot(Transform transform) {
		super(transform);
		// TODO Auto-generated constructor stub
		System.out.println("robot init");
	}
	
	public void move(){
		super.move();
		say();
	}
	public void say(){
		System.out.println("say ");
	}

}
