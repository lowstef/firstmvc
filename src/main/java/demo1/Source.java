/**
 * @author lowstef
 * @create 2018/8/23
 * @since 1.0.0
 */
package demo1;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
