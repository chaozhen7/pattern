package strategy;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月10日 下午6:53:19
 * @version 1.0
 */
public class Context {
	private Strategy detailStrategy;
	public Context(Strategy s){
		this.detailStrategy = s;
	}
	
	public void SetStrategy(Strategy s){
		this.detailStrategy = s;
	}
	public void fun(){
		detailStrategy.function();
	}
}
