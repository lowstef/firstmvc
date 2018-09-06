/**
 * @author lowstef
 * @create 2018/8/14
 * @since 1.0.0
 */
package practice;

import java.math.BigDecimal;

public class Test1{
    public static void main(String[] args) {
        BigDecimal b1 = BigDecimal.valueOf(2.0);
        BigDecimal b2 = BigDecimal.valueOf(1.1);

        double i1 = 2.0;
        double i2 = 1.1;

        System.out.println(b1.subtract(b2));
        BigDecimal add = b1.add(b2);
        System.out.println(add);
        System.out.println(i1*i2);
    }
}
