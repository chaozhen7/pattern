package proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月8日 下午7:45:36
 * @version 1.0
 */
public class CglibProxy implements MethodInterceptor{
	private Object targetObject;
	
	public Object getInstance(Object object){
		this.targetObject = object;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(object.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] arg,
			MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before ..");
		Object object = methodProxy.invoke(targetObject, arg);
		System.out.println("after ..");
		return object;
	}

}
