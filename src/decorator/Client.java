package decorator;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午11:10:32
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transform camaro;
		camaro = new Car();
		camaro.move();
		System.out.println("-----------------------------");

		Transform bumblebee = new Airplane(camaro);
		bumblebee.move();
	}

}
