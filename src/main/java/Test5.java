/**
 * @author lowstef
 * @create 2018/8/10
 * @since 1.0.0
 */

public class Test5 {


    public static void main(String[] args) {
        Integer i = new Integer("3");
        int change = change(i);
        System.out.println(i);
        String s1 = new String();
        s1 = "hello";
        changestr(s1);
        System.out.println(s1);
        StringBuilder sb = new StringBuilder();
        sb.append("你好");
        changesb(sb);
        System.out.println(sb);

    }

    public static int change(int a) {
        a = a + 5;
        return a;
    }

    public static String changestr(String s) {
        s = s + 5;
        return s;
    }
    public static StringBuilder changesb(StringBuilder s) {
        s.append(8);
        return s;
    }

}
