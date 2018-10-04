package reflect;

import java.lang.reflect.Proxy;

public class TestInvocation {
    public static void main(String[] args)throws Exception {
        studengImp si =new studengImp();
        MyInvocationHandler m =new MyInvocationHandler(si);

        student s = (student) Proxy.newProxyInstance(si.getClass().getClassLoader(),si.getClass().getInterfaces(),m);
        s.begin();
        s.end();
    }

}
