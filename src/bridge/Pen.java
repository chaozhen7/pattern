package bridge;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午10:20:06
 * @version 1.0
 */
public abstract class Pen {
	protected Color color;
	public void setColor(Color color){
		this.color = color;
	}
	public abstract void draw(String name);
}
