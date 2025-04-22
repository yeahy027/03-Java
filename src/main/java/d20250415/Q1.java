package d20250415;

public class Q1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("1~100에서 3의 배수의 합: " + sum);
    }
}
