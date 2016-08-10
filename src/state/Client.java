package state;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午8:02:57
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch s1, s2;
		s1 = new Switch("s1");
		s2 = new Switch("s2");

		s1.on();
		s2.on();
		s1.off();
		s2.off();
		s2.on();
		s1.on();
	}

}
