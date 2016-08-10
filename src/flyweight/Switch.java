package flyweight;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月8日 下午7:28:07
 * @version 1.0
 */
public class Switch implements NetworkDevice {
	private String type;
	public Switch(String type){
		this.type = type;
	}
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("linked by Switch type is "+this.type);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

}
