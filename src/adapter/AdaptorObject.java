package adapter;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月2日 下午8:52:32
 * @version 1.0
 */
public class AdaptorObject extends Target {
	private Adaptee adaptee;
	public AdaptorObject(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		adaptee.realFun();
	}

}

/**
 * 对象模式，持有具体的对象实现适配，更具有多态性，更有优势
 * */
