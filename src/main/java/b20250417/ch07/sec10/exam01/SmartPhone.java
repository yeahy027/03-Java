package b20250417.ch07.sec10.exam01;

public class SmartPhone extends Phone {
    SmartPhone(String owner) {
        super(owner);
    }

    void internetSearch() {
        System.out.println("인터넷검색을합니다.");
    }
}
