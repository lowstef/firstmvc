import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author lowstef
 * @create 2018/8/14
 * @since 1.0.0
 */

public class Test12 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1001, "成龙");
        map.put(1002, "周润发");
        map.put(1003, "周星驰");
        map.put(1004, "刘德华");

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }
}
