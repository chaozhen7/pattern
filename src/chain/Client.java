package chain;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午1:57:42
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler sHandler = new SHandler();
		Handler mHandler = new MHandler();
		Handler lHandler = new LHandler();
		
		sHandler.SetHandler(mHandler);
		mHandler.SetHandler(lHandler);
		
		sHandler.handleRequest(17);
	}

}
