package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午10:43:06
 * @version 1.0
 */
public class CompositeSafe extends ComponentSafe {
	List<ComponentSafe> list = new ArrayList<>();
	
	public void add(ComponentSafe c){
		list.add(c);
	}
	
	public void remove(ComponentSafe c){
		list.remove(c);
	}
	
	public ComponentSafe getChild(int i){
		return list.get(i);
	}
	
	@Override
	void operation() {
		// TODO Auto-generated method stub
		for(ComponentSafe c:list){
			c.operation();
		}
	}

}
