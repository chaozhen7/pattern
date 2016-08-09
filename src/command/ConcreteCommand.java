package command;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午2:13:01
 * @version 1.0
 */
public class ConcreteCommand extends Command {
	private Receive receive;
	public ConcreteCommand (Receive r){
		this.receive = r;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("1号发出命令");
		receive.action();
	}

}
