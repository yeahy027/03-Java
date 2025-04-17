package b20250417.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;
        parent.method1();
        parent.method2();
        //parent.method3();
        // 부모 클래스에 선언된 필드와 메소드만 접근 가능하기 때문에 부모 클래스에 선언되지 않은 method3은 호출 불가
    }
}
