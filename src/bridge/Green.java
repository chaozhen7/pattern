package bridge;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午10:19:31
 * @version 1.0
 */
public class Green implements Color {

	@Override
	public void print(String penType, String name) {
		// TODO Auto-generated method stub
		System.out.println(penType+" 绿色"+name+".");
	}

}
