package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }
    public Object invoke(Object proxy, Method method,Object[] args)throws Throwable{
        System.out.println("我被代理了");
        method.invoke(target,args);   //执行被代理对象target的方法
        System.out.println("我被代理完成");
        return null;
    }
}
