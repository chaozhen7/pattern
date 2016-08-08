package builder;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午8:33:58
 * @version 1.0
 */
public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public Product construct(){
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		return builder.getResult();
	}

}
