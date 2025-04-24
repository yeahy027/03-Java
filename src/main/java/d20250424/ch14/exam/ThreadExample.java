package d20250424.ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        Thread musicThread = new Thread(new MusicRunnable());
        Thread movieThread = new Thread(new MovieThread());

        musicThread.start();
        movieThread.start();

    }
}
