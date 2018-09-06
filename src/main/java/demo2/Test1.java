/**
 * @author lowstef
 * @create 2018/8/28
 * @since 1.0.0
 */
package demo2;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE*2); System.out.println(Integer.MIN_VALUE*4);
        String s1 = "hell.o";
        String concat = s1.concat(s1);
        System.out.println(concat);
        int i = s1.indexOf(".");
        System.out.println(i);
        System.out.println(3/2); System.out.println(3.0/2); System.out.println(3.0/2.0);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running");
            }
        }).start();


    }
}
