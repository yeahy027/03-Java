package b20250507.ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 매개변수가 두 개일 경우
        person.action1((name, job) -> {
            System.out.print(name + "이 ");
            System.out.println(job + "을 합니다.");
        });
        person.action1((name, job) -> System.out.println(name + "이 " + job + "을 하지 않습니다."));

        // 매개변수가 하나인 경우
        person.action2(content -> {
            System.out.print("\"" + content + "\"");
            System.out.println("라고 말합니다.");
        });
        person.action2(content -> System.out.println("\"" + content + "\"라고 외칩니다."));
    }
}
