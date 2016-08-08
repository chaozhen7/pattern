package builder;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午8:29:47
 * @version 1.0
 */
public class Product {
	private String partA;
	private String partB;
	private String partC;
	public String getPartA() {
		return partA;
	}
	public void setPartA(String partA) {
		this.partA = partA;
	}
	public String getPartB() {
		return partB;
	}
	public void setPartB(String partB) {
		this.partB = partB;
	}
	public String getPartC() {
		return partC;
	}
	public void setPartC(String partC) {
		this.partC = partC;
	}
	@Override
	public String toString() {
		return "Product [partA=" + partA + ", partB=" + partB + ", partC="
				+ partC + "]";
	}
	
}
