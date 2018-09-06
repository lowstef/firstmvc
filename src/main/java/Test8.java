import java.util.*;

/**
 * @author lowstef
 * @create 2018/8/13
 * @since 1.0.0
 */

public class Test8 {

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("a");
        list.add("b");
        list.add("lowstef");
        list.add("e");
        list.add("f");
        list.add("g");

        for (Object o : list) {
            String s = o.toString();
            System.out.println(s);
        }

        for (ListIterator iterator = list.listIterator(); iterator.hasNext(); ) {
            String next = (String) iterator.next();
            if ("lowstef".equals(next)){
                iterator.add("ok");
            }

        }
//        for (int i = 0; i < list.size(); i++) {
//            String s = (String) list.get(i);
//            if ("lowstef".equals(s)){
//                list.add("ok");
//            }
//        }
        System.out.println(list);

    }




}
