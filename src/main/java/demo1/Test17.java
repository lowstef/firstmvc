/**
 * @author lowstef
 * @create 2018/8/28
 * @since 1.0.0
 */
package demo1;

public class Test17 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a,b);
        System.out.println(a+","+b);
    }
    public static void operator(StringBuffer x,StringBuffer y){
        x.append(y);
        y=x;
    }
}
