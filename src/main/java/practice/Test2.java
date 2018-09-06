/**
 * @author lowstef
 * @create 2018/8/14
 * @since 1.0.0
 */
package practice;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {

        FileInputStream stream = null;
        try {
            stream = new FileInputStream("/Volumes/软件"+File.pathSeparator+"Java学习资料/赠送教材/1第一阶段 JavaSE基础（27天）/如何学习-学前必看.txt");
            try {
                byte[] bytes = new byte[3];
                int read1 = stream.read(bytes);
                while (stream.read() != -1) {
                    int read = stream.read();
                    System.out.print(read);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
