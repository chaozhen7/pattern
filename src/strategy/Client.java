package strategy;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月10日 下午6:55:04
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strategy s = new ConcreteStrategy();
		Context context = new Context(s);
		context.fun();
	}

}
