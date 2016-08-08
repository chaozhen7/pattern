package facade;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月3日 上午11:22:40
 * @version 1.0
 */
public class Facade {
	private SubSystemA subA = new SubSystemA();
	private SubSystemB subB = new SubSystemB();
	private SubSystemC subC = new SubSystemC();
	
	public void method(){
		subA.funA();
		subB.funB();
		subC.funC();
	}
}
