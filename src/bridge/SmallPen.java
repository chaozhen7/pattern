package bridge;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午10:21:58
 * @version 1.0
 */
public class SmallPen extends Pen {

	@Override
	public void draw(String name) {
		// TODO Auto-generated method stub
		String penType = "small";
		this.color.print(penType, name);
	}

}
