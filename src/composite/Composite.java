package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午10:38:48
 * @version 1.0
 */
public class Composite extends Component {
	private List<Component> list = new ArrayList<>();
	
	@Override
	void add(Component component) {
		// TODO Auto-generated method stub
		list.add(component);
	}

	@Override
	void remove(Component component) {
		// TODO Auto-generated method stub
		list.remove(component);
	}

	@Override
	Component getChild(int i) {
		// TODO Auto-generated method stub
		return list.get(i);
	}

	@Override
	void operation() {
		// TODO Auto-generated method stub
		for(Component c:list){
			c.operation();
		}
	}

}
