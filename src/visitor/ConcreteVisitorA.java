package visitor;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月10日 下午7:35:50
 * @version 1.0
 */
public class ConcreteVisitorA extends Visitor {

	@Override
	public void visit(ConcreteElementA elementA) {
		// TODO Auto-generated method stub
		System.out.println("A具体对A元素的操作");
	}

	@Override
	public void visit(ConcreteElementB elementB) {
		// TODO Auto-generated method stub
		System.out.println("A具体对B元素的操作");
	}

}
