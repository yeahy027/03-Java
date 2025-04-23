package d20250423.ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        int[] selectNumber = new int[6];
        Random random = new Random(3);
        System.out.print("선택한 번호: ");
        for(int i = 0; i < selectNumber.length; i++) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        int[] winNumber = new int[6];
        random = new Random(5);
        System.out.print("당첨 번호: ");
        for(int i = 0; i < selectNumber.length; i++) {
            winNumber[i] = random.nextInt(45) + 1;
            System.out.print(winNumber[i] + " ");
        }
        System.out.println();

        Arrays.sort(selectNumber);
        Arrays.sort(winNumber);
        boolean result = Arrays.equals(selectNumber, winNumber);
        System.out.print("당첨 여부: ");
        if (result) {
            System.out.println("1등에 당첨되었습니다.");
        } else {
            System.out.println("꽝입니다.");
        }
    }
}
