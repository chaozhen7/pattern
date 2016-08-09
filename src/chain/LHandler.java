package chain;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午1:56:10
 * @version 1.0
 */
public class LHandler extends Handler {

	@Override
	public void handleRequest(int day) {
		// TODO Auto-generated method stub
		if(day > 5 && day <10){
			System.out.println("L ok ..");
		}
		else{
			System.out.println("go back home －_－");
		}
	}

}
