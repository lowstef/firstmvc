/**
 * @author lowstef
 * @create 2018/8/14
 * @since 1.0.0
 */
package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Poker {
    public static void main(String[] args) {
        String[] s1 = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A", "2"};
        String[] s2 = {"红桃️", "黑桃️", "方片", "梅花"};
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        HashMap<Integer, String> map = new HashMap<>(55);
        for (String ss1 : s1) {
            for (String s3 : s2) {
                map.put(index,s3+ss1);
                list.add(index);
                index++;
            }
        }
        map.put(index,"小王");
        list.add(index);
        map.put(index+1,"大王");
        list.add(index+1);

        //洗牌
        Collections.shuffle(list);



        ArrayList<Integer> dipai = new ArrayList<>();
        ArrayList<Integer> player1 = new ArrayList<>();
        TreeSet<Integer> p1 = new TreeSet<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i >= list.size() - 3) {
                dipai.add(list.get(i));
            } else if (i % 3 == 0) {
                p1.add(list.get(i));
            } else if (i % 3 == 1) {
                player2.add(list.get(i));
            } else if (i % 3 == 2) {
                player3.add(list.get(i));
            }
        }

        for (Integer integer : p1) {
            System.out.print(map.get(integer) + " ");
        }

//        System.out.println(dipai);
//        System.out.println(player1);
//        System.out.println(player2);
//        System.out.println(player3);


    }
}