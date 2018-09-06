/**
 * @author lowstef
 * @create 2018/8/15
 * @since 1.0.0
 */
package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test4 {

    public static void link(String name){
        name += "world";
    }

    public static int getVolue(int i){
        int result = 0;
        switch (i){
            case 1:result = result +i;
            case 2:result = result +i*2;

            case 3:result = result +i*3;
        }
        return result;
    }

    public static void main(String[] args) {

        String name = "hello";
        link(name);
        System.out.println(name);


        int volue = getVolue(2);
        System.out.println(volue);

        ArrayList objects = new ArrayList();
        objects.add(1);
        System.out.println(objects.get(0).getClass());


        Collection collection = Collections.synchronizedCollection(objects);
        List list = Collections.synchronizedList(objects);

    }
}
