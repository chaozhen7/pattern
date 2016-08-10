package observer;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午7:35:29
 * @version 1.0
 */
public class ConcreteSubject extends Subject {
	private String info;
	public ConcreteSubject(String info){
		this.info = info;
	}
	@Override
	public void notice() {
		// TODO Auto-generated method stub
		for(Observer o:observers){
			o.update(info);
		}
	}

}
