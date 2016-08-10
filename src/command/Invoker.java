package command;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午2:09:55
 * @version 1.0
 */
public class Invoker {
	private Command command;
	public Invoker(Command command){
		this.command = command;
	}
	public void setCommand(Command command){
		this.command = command;
	}
	public void call(){
		command.execute();
	}
}
