package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午6:54:55
 * @version 1.0
 */
public abstract class Mediator {
	protected List<Colleague> colleagues = new ArrayList<>();
	
	public void register(Colleague c){
		colleagues.add(c);
	}
	
	public abstract void operation();
}
