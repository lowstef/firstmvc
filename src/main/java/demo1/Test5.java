/**
 * @author lowstef
 * @create 2018/8/21
 * @since 1.0.0
 */
package demo1;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Test5 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.length());
        System.out.println(list.size());



        int sum = list.stream()
                .mapToInt(Object::hashCode)
                .sum();
        System.out.println(sum);
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);


    }

}
