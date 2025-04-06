package singleton;

import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Handler;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {

            final AtomicInteger atomic = new AtomicInteger(i);
            executorService.execute(() -> {
                try {
                    Cuptor.adaugaCuptor(atomic.get());
                    System.out.println(Cuptor.getInstance(atomic.get()));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination((long) Double.POSITIVE_INFINITY,TimeUnit.DAYS);
        System.out.println(Cuptor.getMaxCuptorId() + " cel mai mare");



    }
}
