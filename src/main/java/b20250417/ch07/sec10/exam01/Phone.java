package b20250417.ch07.sec10.exam01;

public abstract class Phone {
    String owner;
    Phone(String owner) {
        this.owner = owner;
    }
    void turnOn() {
        System.out.println("폰전원을켭니다.");
    }
    void turnOff() {
        System.out.println("폰전원을끕니다.");
    }
}
