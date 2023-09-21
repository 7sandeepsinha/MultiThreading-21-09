public class NumberPrinter implements Runnable{
    private int n;

    public NumberPrinter(int n) {
        this.n = n;
    }

    @Override //increases readability, and keeps a check
    public void run() {
        System.out.println("NUMBER : " + n + ", THREAD : " + Thread.currentThread().getName());
    }
}
