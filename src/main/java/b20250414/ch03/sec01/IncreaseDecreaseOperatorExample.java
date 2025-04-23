package b20250414.ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z;
        
        x++;
        ++x;
        System.out.println("x = " + x);
        System.out.println("--------------------------");

        y--;
        --y;
        System.out.println("y = " + y);
        System.out.println("--------------------------");

        z = x++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("--------------------------");

        z = ++x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("--------------------------");

        z = ++x + y++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

// 예상 실행결과

//x = 12
//--------------------------
//y = 18
// --------------------------
//z = 12
//x = 13
//--------------------------
//z = 14
//x = 14
//--------------------------
//z = 33
//x = 15
//y = 19