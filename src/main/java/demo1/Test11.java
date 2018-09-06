/**
 * @author lowstef
 * @create 2018/8/23
 * @since 1.0.0
 */
package demo1;


import java.util.ArrayList;

public class Test11{


        public static void main(String[] args) {
            Sourceable source = new Source();
            Sourceable obj = new Decorator(source);
            obj.method();


            ArrayList<Object> list = new ArrayList<>();
            double v = 3 * 0.1;
            double v1 = 0.3;
            System.out.println(v);


        }



}
