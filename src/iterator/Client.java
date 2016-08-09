package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午2:28:07
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<999;i++){
			list.add(i);
		}
		for(int i:list){		//foreach默认使用Iterator
			System.out.println(i);
		}
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
//集合类中有迭代器，arraylist不推荐使用foreach，推荐使用for（；；），实现了randomAccess接口，随机访问较快