package d20250424.ch14.exam;

public class MovieThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("동영상을 재생합니다.");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
