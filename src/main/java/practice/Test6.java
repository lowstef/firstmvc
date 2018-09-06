/**
 * @author lowstef
 * @create 2018/8/16
 * @since 1.0.0
 */
package practice;

import java.io.*;

public class Test6 {
    public static void main(String[] args) throws IOException {
//
//        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("hello.txt"), "gbk");
//        String encoding = inputStreamReader.getEncoding();
//        char[] cc = new char[18];
//        System.out.println(encoding);
//        inputStreamReader.read(cc);
//        //for(char c : cc)
//            //System.out.println(c);
//        String s = new String(cc);
//        System.out.println(s);



        BufferedReader bufferedReader = new BufferedReader(new FileReader("hello.txt"));



        String s;
        while ((s=bufferedReader.readLine()) != null){

            String gbk = new String(s.getBytes("utf-8"), "gbk");
            System.out.println(gbk);
            String utf8 = new String(s.getBytes("gbk"), "utf-8");
            System.out.println(utf8);
        }
        try (
                FileReader fileReader = new FileReader("hello.txt")) {
                
            int temp;

            while ((temp = fileReader.read()) != -1){
                System.out.print((char)temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
