/**
 * @author lowstef
 * @create 2018/8/9
 * @since 1.0.0
 */

public class Test3 {

    public static void main(String[] args) {

    String s1 = "你好";
    String s2 = new String("你好");
        byte[] bytes = s1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        System.out.println(s1.equals(s2));
        int i1= 10;
        int i2= 10;
        System.out.println();


    }






}
