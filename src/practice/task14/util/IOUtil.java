package practice.task14.util;

import java.io.FileInputStream;
import java.io.IOException;

public class IOUtil {
    public static String readFile(String filename) {
        try (FileInputStream fileInputStream = new FileInputStream(filename)) {
            byte[] fileBytes = new byte[fileInputStream.available()];
            fileInputStream.read(fileBytes);
            return new String(fileBytes);
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
            return null;
        }
    }

}
