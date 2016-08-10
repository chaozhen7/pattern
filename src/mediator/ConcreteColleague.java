package mediator;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午6:59:51
 * @version 1.0
 */
public class ConcreteColleague extends Colleague {

	public ConcreteColleague(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteColleague method1 run ..");
	}

}
