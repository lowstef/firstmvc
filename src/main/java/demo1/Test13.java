/**
 * @author lowstef
 * @create 2018/8/24
 * @since 1.0.0
 */
package demo1;

public class Test13 {
    public static void main(String[] args) {


    String s = "String";
        System.out.println(s);
    change(s);
        System.out.println(s);//值没有改变

    StringBuffer sb = new StringBuffer();
        sb.append("StringBuffer");
        System.out.println(sb);
    change(sb);
        System.out.println(sb);
}

    public static void change(StringBuffer sb) {
        sb.append("java");
    }

    public static void change(String s) {
        s += "java";
    }
}
