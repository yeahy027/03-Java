package d20250415;

public class Q5 {
    public static void main(String[] args) {
        int [] array = {1, 5, 3, 8, 2};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("최대값: " + max);
    }
}
