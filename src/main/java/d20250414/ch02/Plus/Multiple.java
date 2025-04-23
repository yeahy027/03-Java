package d20250414.ch02.Plus;

public class Multiple {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println((x > 7) && (y <= 5));
        System.out.println((x % 3 == 2) || (y % 2 != 1));
    }
}

// 예상 실행 결과
// true
// false