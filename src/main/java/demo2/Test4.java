/**
 * @author lowstef
 * @create 2018/9/7
 * @since 1.0.0
 */
package demo2;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] split = s.split("");

        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < split.length; j++) {
                System.out.println(split[j]);

            }


        }






    }


}
