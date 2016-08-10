package flyweight;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月8日 下午7:26:18
 * @version 1.0
 */
public class Hub implements NetworkDevice {
	private String type;
	public Hub(String type){
		this.type = type;
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("linked by Hub type is "+this.type);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

}
