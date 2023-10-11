package StreamsFiles;

import java.io.*;
import java.util.regex.Pattern;

public class A02WritetoFile {
    public static void main(String[] args) {
        String inputPath = "/Users/djamistyle/Desktop/Java Projects/Java Exercises/src/StreamsFiles/input.txt";
        String outputPath = "/Users/djamistyle/Desktop/Java Projects/Java Exercises/src/StreamsFiles/output.txt";
        String symbolPattern = "[,.!?;]";
        Pattern pattern = Pattern.compile(symbolPattern);
        try (InputStream in = new FileInputStream(inputPath);
             OutputStream out = new FileOutputStream(outputPath)) {
            int oneByte;
            while ((oneByte = in.read()) >= 0) {
                if (!pattern.matcher(String.valueOf((char) oneByte)).find()) {
                    out.write(oneByte);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
