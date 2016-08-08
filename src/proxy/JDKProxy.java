package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月8日 下午7:42:12
 * @version 1.0
 */
public class JDKProxy implements InvocationHandler {
	private Object object;

	public Object getInstance(Object object) {
		this.object = object;
		return Proxy.newProxyInstance(this.object.getClass().getClassLoader(),
				this.object.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before ..");
		Object object = method.invoke(this.object, args);
		System.out.println("after ..");
		return object;
	}

}
