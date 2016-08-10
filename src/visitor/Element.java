package visitor;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月10日 下午7:29:56
 * @version 1.0
 */
public interface Element {
	public void accept(Visitor visitor);
}
