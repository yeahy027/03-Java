package b20250422.ch09.sec07.exam02;

public class Home {
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }
}
