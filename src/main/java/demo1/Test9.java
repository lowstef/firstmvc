/**
 * @author lowstef
 * @create 2018/8/23
 * @since 1.0.0
 */
package demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test9 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                System.out.println("线程");
                getName();
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable");
                Thread.currentThread().getName();
            }
        }).start();


        CopyOnWriteArrayList list = new CopyOnWriteArrayList(new ArrayList());

    }
}
