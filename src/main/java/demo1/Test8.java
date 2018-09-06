/**
 * @author lowstef
 * @create 2018/8/22
 * @since 1.0.0
 */
package demo1;

import java.util.*;

public class Test8 {
    public static void main(String[] args) {
        HashMap<Integer, User> hashMap = new HashMap<>();
        hashMap.put(1,new User("张三",20));
        hashMap.put(2,new User("赵四",26));
        hashMap.put(3,new User("王五",18));
        System.out.println(hashMap);
        Set<Map.Entry<Integer, User>> entries = hashMap.entrySet();
        ArrayList<Map.Entry<Integer, User>> list = new ArrayList<>(entries);
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o2.getValue().getAge()-o1.getValue().getAge();
            }
        });
        HashMap<Integer, User> map = new HashMap<>();
        for (Map.Entry<Integer, User> integerUserEntry : list) {
            map.put(integerUserEntry.getKey(),integerUserEntry.getValue());
            
        }
        System.out.println(map);
    }
}
