package state;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午8:00:06
 * @version 1.0
 */
public class OffState extends State {

	@Override
	public void on(Switch s) {
		// TODO Auto-generated method stub
		System.out.println("即将打开");
		s.setState(s.getState("on"));;
	}

	@Override
	public void off(Switch s) {
		// TODO Auto-generated method stub
		System.out.println("已经关闭");
	}

}
