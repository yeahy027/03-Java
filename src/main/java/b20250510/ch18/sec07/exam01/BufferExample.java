package b20250510.ch18.sec07.exam01;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception {
        String originalFilePath = "C:/temp/originalFile1.jpg";
        String targetFilePath = "C:/temp/originalFile2.jpg";

        FileInputStream fis = new FileInputStream(originalFilePath);
        FileOutputStream fos = new FileOutputStream(targetFilePath);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        long bufferTime = copy(bis, bos);
        System.out.println(bufferTime + "ns");

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }

    public static long copy(InputStream is, OutputStream os) throws IOException {
        // 시작 시간 저장
        long start = System.nanoTime();

        // 1 바이트 읽고 1 바이트 출력
        while(true) {
            int data = is.read();
            if(data == -1) break;
            os.write(data);
        }
        os.flush();

        // 끝 시간 저장
        long end = System.nanoTime();

        // 복사 시간 리턴
        return (end - start);
    }
}
