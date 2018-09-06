import java.util.*;

/**
 * @author lowstef
 * @create 2018/8/13
 * @since 1.0.0
 */

public class Test11 {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars = s.toCharArray();


        TreeSet<Character> treeSet = new TreeSet<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                int num = o1.compareTo(o2);
                //保存重复数据
                return num == 0 ? 1 : num;
            }

        });

        System.out.println(treeSet);


    }
}
