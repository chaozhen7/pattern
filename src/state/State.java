package state;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午7:53:15
 * @version 1.0
 */
public abstract class State {
	public abstract void on(Switch s);
	public abstract void off(Switch s);
}
