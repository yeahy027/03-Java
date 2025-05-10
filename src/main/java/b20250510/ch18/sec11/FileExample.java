package b20250510.ch18.sec11;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file1 = new File("C:/temp/file1.txt");
        if(file1.exists()) {
            if (file1.isFile()) {
                System.out.println("파일 경로 : " + file1.getPath());
                System.out.println("파일 크기 : " + file1.length());
            }

            if (file1.isDirectory()) {
                System.out.println("<dir> 파일 경로 : " + file1.getPath());
            }
        } else {
            System.out.println("해당 파일은 없는 파일입니다.");
        }
    }
}
