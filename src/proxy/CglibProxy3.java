package proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年9月20日 下午7:45:36
 * @version 1.0
 */
public class CglibProxy3 implements MethodInterceptor{
	
	private CglibProxy3(){
		
	}
	private static CglibProxy3 instance = new CglibProxy3();
	
	public static CglibProxy3 getInstance(){
		return instance;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);		//here
    }
	
	@Override
	public Object intercept(Object obj, Method method, Object[] arg,
			MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before ..");
		Object object = methodProxy.invokeSuper(obj, arg);	//注意这里的变化
		System.out.println("after ..");
		return object;
	}

}
