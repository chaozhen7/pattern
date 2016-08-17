package observer;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午7:38:13
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new ConcreteSubject("test info");
		Observer observer1 = new ConcreteObserver();
		Observer observer2 = new ConcreteObserver();
		subject.add(observer1);
		subject.add(observer2);
		subject.change();
	}

}
