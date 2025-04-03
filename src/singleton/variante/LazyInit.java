package singleton.variante;

public class LazyInit {
    private static LazyInit INSTANCE;

    private LazyInit(){}
    public static LazyInit getINSTANCE() {
        if(INSTANCE == null) {
            INSTANCE = new LazyInit();
        }
        return INSTANCE;
    }

}

class Run {
    public static void main(String[] args) {
        //LazyInit lazyInit = new LazyInit();
        LazyInit lazyInit = LazyInit.getINSTANCE();
        LazyInit lazyIni2 = LazyInit.getINSTANCE();
        if(lazyInit == lazyIni2) {
            System.out.println("egale");
        }
    }
}

