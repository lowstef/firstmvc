/**
 * @author lowstef
 * @create 2018/8/15
 * @since 1.0.0
 */
package practice;

import java.io.*;

public class Test5 implements sescond{

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("hello.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("file"+ File.separator+"world.txt");

        byte[] bytes = new byte[6];
        while (fileInputStream.read(bytes) != -1){
            System.out.println(bytes);
            fileOutputStream.write(bytes);
        }


        fileInputStream.close();
        fileOutputStream.close();


        Test5 test5 = new Test5();
        test5.sescond();

    }
}
