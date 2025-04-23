package d20250423.ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        try {
            account.withdraw(5000);
            System.out.println("출금 후 잔액: " + account.getBalance());
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }

        try {
            account.withdraw(7000);
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
