import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        System.out.println("Hello world!, THREAD : " +
//                Thread.currentThread().getName());
//        HelloWorldPrinter hwp = new HelloWorldPrinter();
//        Thread t1 = new Thread(hwp);
//        t1.start();

//        for(int i=1;i<=100;i++){
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread t = new Thread(numberPrinter);
//            t.start();
//        }
//        ExecutorService executor = Executors.newFixedThreadPool(10);
//        for(int i=1;i<=100;i++){
//            if(i==11 || i==51 || i==100){
//                System.out.println("Hello");
//            }
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            executor.submit(numberPrinter);
//        }
//        executor.shutdown();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        RandomNumberGenerator r1 = new RandomNumberGenerator();
        RandomNumberGenerator r2 = new RandomNumberGenerator();

        Future<Integer> random1 = executor.submit(r1);
        Future<Integer> random2 = executor.submit(r2);
        System.out.println("Before GET Hello World : Thread " + Thread.currentThread().getName());
        int randomInteger1 = random1.get();
        int randomInteger2 = random2.get();
        System.out.println("AFTER GET Hello World : Thread " + Thread.currentThread().getName());
        System.out.println("SUM : " + (randomInteger1 + randomInteger2) + ", Thread : " + Thread.currentThread().getName());

    }
}