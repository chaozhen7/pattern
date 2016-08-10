package templateMethod;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月10日 下午7:17:27
 * @version 1.0
 */
public abstract class AbstractClass {
	public void TemplateMethod(){
		fun1();
		if(hook()){
			System.out.println("要执行");
		}
		else{
			System.out.println("不用执行");
		}
		fun2();
	}
	
	public void fun1(){
		System.out.println("统一的方法");
	}
	
	public boolean hook(){
		System.out.println("勾子方法");
		return true;
	}
	
	public abstract void fun2();
}
