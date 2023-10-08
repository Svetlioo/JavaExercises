package StreamsFiles;

import java.io.*;
import java.util.regex.Pattern;

public class A02WritetoFile {
    public static void main(String[] args) {
        String path = "/Users/djamistyle/Desktop/Java Projects/Java Exercises/src/StreamsFiles/input.txt";
        String symbolPattern = "[,.!?;]";
        Pattern pattern = Pattern.compile(symbolPattern);

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int charRead;
            StringBuilder filteredText = new StringBuilder();

            while ((charRead = reader.read()) != -1) {
                char character = (char) charRead;
                if (!pattern.matcher(String.valueOf(character)).find()) {
                    filteredText.append(character);
                }
            }

            System.out.println(filteredText);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
