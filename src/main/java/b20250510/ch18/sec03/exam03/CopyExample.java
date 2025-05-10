package b20250510.ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        String originalFileName = "C:/temp/test.jpg";
        String targetFileName = "C:/temp/test2.jpg";

        // InputStream is = new FileInputStream(originalFileName);
        // OutputStream os = new FileOutputStream(targetFileName);
        // is.transferTo(os);

        try (InputStream is = new FileInputStream(originalFileName);
            OutputStream os = new FileOutputStream(targetFileName)) {
            is.transferTo(os);
        }

        System.out.println("복사가 잘 되었습니다.");
    }
}
