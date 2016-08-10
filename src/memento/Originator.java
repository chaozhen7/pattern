package memento;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午7:15:45
 * @version 1.0
 */
public class Originator {
	private String state;
	public Originator(String state){
		this.state = state;
	}
	
	public Memento createMemento(){
		return new Memento(this);
	}
	
	public void restoreMemento(Memento m){
		this.state = m.state;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
