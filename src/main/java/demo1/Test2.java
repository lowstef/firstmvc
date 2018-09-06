/**
 * @author lowstef
 * @create 2018/8/18
 * @since 1.0.0
 */
package demo1;

import java.io.File;

public class Test2 {

    public static void main(String[] args) {
        showDirectory(new File("/Volumes/软件/哈哈"));
    }

    public static void showDirectory(File f) {
        _walkDirectory(f, 0);
    }

    private static void _walkDirectory(File f, int level) {
        if(f.isDirectory()) {
            for(File temp : f.listFiles()) {
                _walkDirectory(temp, level + 1);
            }
        }
        else {
            for(int i = 0; i < level - 1; i++) {
                System.out.print("\t");
            }
            System.out.println(f.getName());
        }
    }


}
