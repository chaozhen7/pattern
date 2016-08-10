package visitor;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月10日 下午7:29:31
 * @version 1.0
 */
public abstract class Visitor {
	public abstract void visit(ConcreteElementA elementA);
	public abstract void visit(ConcreteElementB elementB);
}
