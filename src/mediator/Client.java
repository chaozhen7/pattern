package mediator;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午7:00:49
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mediator mediator = new ConcreteMediator();
		Colleague colleague = new ConcreteColleague(mediator);
		mediator.register(colleague);
		mediator.operation();
	}

}
