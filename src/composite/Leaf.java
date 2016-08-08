package composite;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午10:37:17
 * @version 1.0
 */
public class Leaf extends Component {

	@Override
	void add(Component component) {
		// TODO Auto-generated method stub
		System.out.println("叶子节点不支持");
	}

	@Override
	void remove(Component component) {
		// TODO Auto-generated method stub
		System.out.println("叶子节点不支持");
	}

	@Override
	Component getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void operation() {
		// TODO Auto-generated method stub
		System.out.println("叶子节点do something");
	}

}
