/**
 * @author lowstef
 * @create 2018/8/16
 * @since 1.0.0
 */
package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test7 {
    public static void main(String[] args) {

        Integer integer = Integer.valueOf("101");
        int a = integer;
        System.out.println(a);


        long round = Math.round(-11.9);
        System.out.println(round);

        String s = "你好";
        int length = s.length();
        System.out.println(length);

        String[] strings = {"hello","world"};
        int length1 = strings.length;
        System.out.println(length1);

        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.size();

        HashSet<Object> set = new HashSet<>();
        set.add(321);
        System.out.println(set.size());


        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put(123,321);
        int size = hashMap.size();
        System.out.println(size);

        double floor = Math.floor(-11.1);
        System.out.println(floor);


    }
}
