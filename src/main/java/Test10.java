import java.util.ArrayList;

/**
 * @author lowstef
 * @create 2018/8/13
 * @since 1.0.0
 */

public class Test10 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Person("张三",25));
        list.add(1024);
        list.add("hello");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println(list.get(0));

    }
}
