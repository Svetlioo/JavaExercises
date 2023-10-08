package StreamsFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class A01ReadFile {
    public static void main(String[] args){
        String path = "/Users/djamistyle/Desktop/Java Projects/Java Exercises/src/StreamsFiles/input.txt";

        try (InputStream in = new FileInputStream(path)) {
            int oneByte = in.read();
            while (oneByte > -1) {
//                System.out.printf("%c", (char) oneByte);
                System.out.printf("%d, ", oneByte);
                oneByte = in.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
