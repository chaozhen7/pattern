package flyweight;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月8日 下午7:31:55
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetworkDevice nd1, nd2, nd3, nd4, nd5;
		DeviceFactory df = new DeviceFactory();

		nd1 = df.getNetworkDevice("cisco");
		nd1.use();

		nd2 = df.getNetworkDevice("cisco");
		nd2.use();

		nd3 = df.getNetworkDevice("cisco");
		nd3.use();

		nd4 = df.getNetworkDevice("tp");
		nd4.use();

		nd5 = df.getNetworkDevice("tp");
		nd5.use();

		System.out.println("Total Device:" + df.getTotalDevice());
		System.out.println("Total Terminal:" + df.getTotalTerminal());
	}

}
//享元模式，有一个公共池，有直接返回，没有先添加再返回，String 池
