package d20250415;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        int stun = 0;
        int[] scores = null;

        while (run) {
            System.out.println("---------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("---------------------------------------");
            System.out.println("선택 > ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("학생수 > ");
                    stun = sc.nextInt();
                    scores = new int[stun];
                    break;
                case 2:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "] > ");
                        scores[i] = sc.nextInt();
                    }
                    break;
                case 3:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "] : " + scores[i]);
                    }
                    break;
                case 4:
                    int max = 0;
                    int sum = 0;
                    for (int i = 0; i < scores.length; i++) {
                        if (scores[i] > max) {
                            max = scores[i];
                        }
                        sum += scores[i];
                    }
                    double avg = (double) sum / scores.length;
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + avg);
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
