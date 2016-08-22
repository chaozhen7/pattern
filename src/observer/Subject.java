package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午7:32:11
 * @version 1.0
 */
public abstract class Subject {
	protected List<Observer> observers = new ArrayList<>();
	public void add(Observer o){
		observers.add(o);
	}
	public void remove(Observer o){
		observers.remove(o);
	}
	public abstract void notice();
	
	public void change(){
		System.out.println("改变");
		this.notice();
	}
}
