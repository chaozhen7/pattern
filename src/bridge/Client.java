package bridge;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午10:23:57
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen bigPen = new BigPen();
		Color color = new Red();
		bigPen.setColor(color);
		bigPen.draw("lucky man");
	}

}
