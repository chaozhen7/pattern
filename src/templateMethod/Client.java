package templateMethod;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月10日 下午7:21:00
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass con = new ConcreteClass();
		con.TemplateMethod();
	}

}
