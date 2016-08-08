package bridge;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午10:23:24
 * @version 1.0
 */
public class BigPen extends Pen {

	@Override
	public void draw(String name) {
		// TODO Auto-generated method stub
		String penType = "Big";
		this.color.print(penType, name);
	}

}
