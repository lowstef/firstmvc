import java.util.ArrayList;
import java.util.Collection;

/**
 * @author lowstef
 * @creat 2018/8/13
 * @since 1.0.0
 */

@SuppressWarnings({ "rawtypes", "unchecked" })//去除集合的警告
public class Test7 {

    public static void main(String[] args) {
        retainAll();
        containsAll();
        removeAll();
        addAll();
    }

    public static void retainAll() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("c");
        c2.add("d");
        c2.add("e");
        c2.add("f");

        //取交集,如果c1里面的元素全部包含在两者的交集里面，返回false，否则返回true
        boolean b = c1.retainAll(c2);
        System.out.println(b);
        System.out.println(c1);
    }

    public static void containsAll() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("z");

        //判断调用的集合是否包含传入的集合
        boolean b = c1.containsAll(c2);
        System.out.println(b);
    }

    public static void removeAll() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("x");
        c2.add("y");
        c2.add("z");

        //删除的是交集
        boolean b = c1.removeAll(c2);
        System.out.println(b);
        System.out.println(c1);
    }

    public static void addAll() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("c");
        c2.add("d");

        //将c2中的每一个元素添加到c1中
        c1.addAll(c2);
        System.out.println(c1);
    }
}