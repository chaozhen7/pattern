package memento;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午7:16:03
 * @version 1.0
 */
class Memento {
	String state;
	
	public Memento(Originator o){
		this.state = o.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
