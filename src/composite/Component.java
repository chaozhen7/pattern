package composite;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午10:35:39
 * @version 1.0
 */
public abstract class Component {
	abstract void add(Component component);
	abstract void remove(Component component);
	abstract Component getChild(int i);
	abstract void operation();
}
