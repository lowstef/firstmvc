/**
 * @author lowstef
 * @create 2018/8/18
 * @since 1.0.0
 */
package demo1;

import java.io.BufferedReader;
import java.io.FileReader;

public final class MyUtil {

    private MyUtil() {

    }

    public static int countWordInFile(String filename, String word) {
        int counter = 0;
        try (FileReader fr = new FileReader(filename)) {
            try (BufferedReader br = new BufferedReader(fr)) {
                String line = null;
                while ((line = br.readLine()) != null) {
                    int index = -1;
                    while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0) {
                        counter++;
                        line = line.substring(index + word.length());
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return counter;
    }


}
