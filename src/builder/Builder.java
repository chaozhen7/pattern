package builder;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午8:30:58
 * @version 1.0
 */
public abstract class Builder {
	//创建产品对象
    protected  Product product=new Product();
    public  abstract void buildPartA();
    public  abstract void buildPartB();
    public  abstract void buildPartC();
    //返回产品对象
	public Product getResult() {
		return product;
	}
}
