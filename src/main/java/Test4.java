import java.util.Scanner;

/**
 * @author lowstef
 * @create 2018/8/10
 * @since 1.0.0
 */

public class Test4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
//        String s = "stef stef stef";
//        char[] chars = s.toCharArray();
        System.out.println(s);

        /**
         * 字符串倒序输出
         */
//        for (int i = chars.length - 1; i >= 0; i--) {
//            System.out.print(chars[i]);
//        }
//        int count = 0;
//
        /**
         * 统计大写字母出现次数
         */
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] > 'A' && chars[i] < 'Z') {
//                count++;
//            }
//        }
//        System.out.println("大写字母出现" + count + "次");

        /**
         * 统计字符串出现次数
         */
        String str = "stef";

        int count1 = 0;
        int index = 0;

        while ((index = s.indexOf(str)) != -1){
            count1++;
            s = s.substring(index + str.length());
        }
        System.out.println("字符串出现" + count1 + "次");

    }
}
