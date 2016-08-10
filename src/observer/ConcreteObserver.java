package observer;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午7:37:39
 * @version 1.0
 */
public class ConcreteObserver extends Observer {

	@Override
	public void update(String info) {
		// TODO Auto-generated method stub
		System.out.println(this+"接收到的信息是 "+info);
	}

}
