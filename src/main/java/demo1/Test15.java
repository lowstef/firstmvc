/**
 * @author lowstef
 * @create 2018/8/27
 * @since 1.0.0
 */
package demo1;

import java.io.Serializable;
import java.util.Map;

public class Test15 implements Serializable {

    int demo(){
        int i = 1;
        try {

            System.out.println("try");
            return i;
        }finally {
            System.out.println("finally");
            ++i;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Test15().demo());
    }


}
