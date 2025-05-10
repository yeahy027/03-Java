package b20250510.ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:/temp/test3.txt"));

        while(true) {
            String str = br.readLine();
            if(str == null) break;
            System.out.println(str);
        }

        br.close();
    }
}
