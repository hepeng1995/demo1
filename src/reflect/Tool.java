package reflect;

import java.lang.reflect.Field;

public class Tool {

    public void update(Object obj,String propertyName,String value)throws Exception{
        Class clazz=obj.getClass();
        Field f=clazz.getDeclaredField(propertyName);
        f.setAccessible(true);
        f.set(obj,value);
    }
}
