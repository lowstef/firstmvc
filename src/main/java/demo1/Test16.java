/**
 * @author lowstef
 * @create 2018/8/27
 * @since 1.0.0
 */
package demo1;

public class Test16 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "he"+new String("llo");
        String str3 = "he"+"llo";
        System.err.println(str1== str2); System.err.println(str1 == str3);
    }
}
