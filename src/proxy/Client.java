package proxy;
/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月8日 下午7:52:20
 * @version 1.0
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("静态代理");
		ProxyInterface staticReal = new StaticProxy();
		staticReal.func();
		System.out.println("JDK动态代理");
		ProxyInterface jdkReal = (ProxyInterface) new JDKProxy().getInstance(new RealClass());
		jdkReal.func();
		System.out.println("Cglib动态代理");
		ProxyInterface cglibReal = (ProxyInterface) new CglibProxy().getInstance(new RealClass());
		cglibReal.func();
	}

}
//代理模式 静态代理 jdk动态代理 cglib动态代理模式 jdk针对实现相同的接口，cglib针对继承 可以不实现接口，但是不能是final类