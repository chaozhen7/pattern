package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月10日 下午7:37:04
 * @version 1.0
 */
public class ObjectStructure {
	private List<Element> elements = new ArrayList<>();
	
	public void accept(Visitor v){
		for(Element e:elements){
			e.accept(v);
		}
	}
	public void add(Element e){
		elements.add(e);
	}
	public void remove(Element e){
		elements.remove(e);
	}
}
