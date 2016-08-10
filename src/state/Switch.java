package state;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午7:53:25
 * @version 1.0
 */
class Switch {
	private static State state,onState,offState;
	private String name;
	public Switch(String name){
		this.name = name;
		onState = new OnState();
		offState = new OffState();
		state = onState;
	}
	public void setState(State state){
		this.state=state;
	}
	
	public void on(){
		System.out.println(name+ " kai");
		state.on(this);
	}
	
	public void off(){
		System.out.println(name+ " guan");
		state.off(this);
	}
	
	public  State getState(String type){
		if(type.equalsIgnoreCase("on")){
			return onState;
		}
		else if(type.equalsIgnoreCase("off")){
			return offState;
		}
		return null;
	}
}
