package builder;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午8:37:05
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder = new BuilderA(); //可通过配置文件实现 
		Director director = new Director(builder);
		Product product = director.construct();
		System.out.println(product);
	}

}
