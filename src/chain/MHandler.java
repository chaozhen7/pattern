package chain;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午1:54:53
 * @version 1.0
 */
public class MHandler extends Handler {

	@Override
	public void handleRequest(int day) {
		// TODO Auto-generated method stub
		if(day >2 && day <= 5){
			System.out.println("M ok ..");
		}
		else{
			this.successHandler.handleRequest(day);
		}
	}

}
