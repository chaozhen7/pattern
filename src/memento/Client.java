package memento;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午7:21:13
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator("原始");
		Memento memento = originator.createMemento();
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(memento);
		
		System.out.println(originator.getState());
		System.out.println("-------改变-------");
		originator.setState("change");
		System.out.println(originator.getState());
		System.out.println("-------反悔-------");
		originator.restoreMemento(caretaker.getMemento());
		System.out.println(originator.getState());
	}

}
//存储多个备忘录 可以反悔多次