/**
 * @author lowstef
 * @create 2018/8/28
 * @since 1.0.0
 */
package demo2;

public class NULL{
    static boolean foo(char c) {
        System.out.print(c);
        return true;
    }
    public static void main(String[] args) {
        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;
            foo('D'); }
    }
     }
