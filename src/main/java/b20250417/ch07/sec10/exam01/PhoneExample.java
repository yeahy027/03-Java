package b20250417.ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        //Phone phone = new Phone(); // new 연산자로 직접 생성 불가

        SmartPhone smartPhone = new SmartPhone("홍길동"); // 자식 객체인 smartPhone은 new 연산자로 객체 생성 가능
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
