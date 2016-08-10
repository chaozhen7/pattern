package mediator;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午6:55:26
 * @version 1.0
 */
public abstract class Colleague {
	protected Mediator mediator;
	public Colleague (Mediator mediator){
		this.mediator = mediator;
	}
	
	public abstract void method1();
	
	public void method2(){
		mediator.operation();
	}
}
