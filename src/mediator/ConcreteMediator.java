package mediator;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午6:58:51
 * @version 1.0
 */
public class ConcreteMediator extends Mediator {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		colleagues.get(0).method1();
	}

}
