package decorator;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午11:04:54
 * @version 1.0
 */
public class Change implements Transform {
	private Transform transform;
	public Change(Transform transform){
		this.transform = transform;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		transform.move();
	}

}
