/**
 * @author lowstef
 * @create 2018/8/20
 * @since 1.0.0
 */
package demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Properties;

public class Test4 {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> aClass = Class.forName("java.lang.StringBuffer");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            String s = Modifier.toString(constructor.getModifiers());
            System.out.println(s);
            System.out.println(constructor.getName());
        }

        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());

        }


    }




}
