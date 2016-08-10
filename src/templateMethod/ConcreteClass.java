package templateMethod;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月10日 下午7:20:15
 * @version 1.0
 */
public class ConcreteClass extends AbstractClass {

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("具体的方法");
	}
	
	public boolean hook(){
		return false;
	}

}
