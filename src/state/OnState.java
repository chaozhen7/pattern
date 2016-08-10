package state;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午7:56:03
 * @version 1.0
 */
public class OnState extends State {

	@Override
	public void on(Switch s) {
		// TODO Auto-generated method stub
		System.out.println("已经打开");
	}

	@Override
	public void off(Switch s) {
		// TODO Auto-generated method stub
		System.out.println("即将关闭");
		s.setState(s.getState("off"));
	}

}
