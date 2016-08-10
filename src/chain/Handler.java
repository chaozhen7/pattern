package chain;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月9日 下午1:48:27
 * @version 1.0
 */
public abstract class Handler {
	protected Handler successHandler;
	public void SetHandler(Handler handler){
		this.successHandler = handler;
	}
	public abstract void handleRequest(int day);
}
