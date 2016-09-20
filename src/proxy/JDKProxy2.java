package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年9月20日 上午11:12:06
 * @version 1.0
 */
public class JDKProxy2 implements InvocationHandler {
	private Object target;

	public JDKProxy2(Object object) {
		this.target = object;
	}

	@SuppressWarnings("unchecked")
	public <T> T getInstance() {
		return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before ..");
		Object object = method.invoke(target, args);
		System.out.println("after ..");
		return object;
	}

}
