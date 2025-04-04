package singleton.v1Licente.program;

import singleton.v1Licente.clase.Licenta;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {


    public static void main(String[] args) {
        System.out.println("1");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Licenta.getInstance());
            }
        });
        thread.start();
        System.out.println(Licenta.getInstance());
        System.out.println(Licenta.getInstance());

        System.out.println("2");
        System.out.println("Se face cu builder");
    }
}
