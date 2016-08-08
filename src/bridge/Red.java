package bridge;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午10:18:40
 * @version 1.0
 */
public class Red implements Color {

	@Override
	public void print(String penType, String name) {
		// TODO Auto-generated method stub
		System.out.println(penType+" 红色"+name+".");
	}

}
