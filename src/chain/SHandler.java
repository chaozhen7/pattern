package chain;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午1:50:59
 * @version 1.0
 */
public class SHandler extends Handler {
	
	@Override
	public void handleRequest(int day) {
		// TODO Auto-generated method stub
		if(day >=0 && day <= 2){
			System.out.println("s ok ..");
		}
		else{
			this.successHandler.handleRequest(day);
		}
	}

}
