/**
 * @author lowstef
 * @create 2018/8/24
 * @since 1.0.0
 */
package demo1;

import java.sql.SQLOutput;

public class Test12 {


    public Test12() {
        System.out.println("构造方法");
    }

    static {
        System.out.println("静态代码块");
    }

    public static void main(String[] args) {
        String str = "hello";
        str.length();
        String[] strings = new String[5];
        int length = strings.length;

        System.out.println(Test12.class);
    }

}
