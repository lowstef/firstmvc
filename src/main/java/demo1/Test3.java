/**
 * @author lowstef
 * @create 2018/8/18
 * @since 1.0.0
 */
package demo1;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Test3 {

    public static void main(String[] args) throws IOException {

        MyUtil.countWordInFile("hellolowstef","o");


        Path initPath = Paths.get("/Volumes/软件/哈哈");
        Files.walkFileTree(initPath, new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                    throws IOException {
                System.out.println(file.getFileName().toString());
                return FileVisitResult.CONTINUE;
            }

        });
    }
}
