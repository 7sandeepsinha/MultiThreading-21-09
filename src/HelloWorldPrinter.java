public class HelloWorldPrinter implements Runnable {
    public void run(){
        System.out.println(2);
        System.out.println("Hello World, THREAD " +
                Thread.currentThread().getName());
    }
}
