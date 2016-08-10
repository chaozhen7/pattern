package visitor;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月10日 下午7:31:02
 * @version 1.0
 */
public class ConcreteElementA implements Element {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	
	public void operateA(){
		System.out.println("具体的业务方法A");
	}

}
