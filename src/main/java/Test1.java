;import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lowstef
 * @create 2018/8/7
 * @since 1.0.0
 */

public class Test1 {
    public static void main(String[] args) {
        int[] a = {10, 3, 1, 7, 9};

        unsort(a);

        for (int i : a) {
            System.out.println(i);
        }


//        System.out.println(max(a));


//        Arrays.sort(a);
//        System.out.println(a[a.length-1]);
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();
//        System.out.println(s);


    }

    public static void unsort(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            int temp = a[i];

            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
    }

    public static int max(int[] a) {
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }

        }

        return max;
    }

}
