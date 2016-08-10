package command;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午2:15:58
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receive receive = new ConcreteReceive();
		Command command = new ConcreteCommand(receive);
		Invoker invoker = new Invoker(command);
		invoker.call();
	}

}
