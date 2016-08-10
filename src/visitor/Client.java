package visitor;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月10日 下午7:39:44
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Element a = new ConcreteElementA();
		Element b = new ConcreteElementB();
		ObjectStructure ob = new ObjectStructure();
		ob.add(a);
		ob.add(b);
		Visitor aVisitor = new ConcreteVisitorA();
		Visitor bVisitor = new ConcreteVisitorB();
		ob.accept(aVisitor);
		ob.accept(bVisitor);
	}

}
