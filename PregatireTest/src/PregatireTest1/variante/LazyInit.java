package PregatireTest1.variante;

public class LazyInit {
    private static LazyInit INSTANCE;

    private LazyInit(){}
    public static LazyInit getINSTANCE() {
        if(INSTANCE == null) {
            INSTANCE = new LazyInit();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        //LazyInit lazyInit = LazyInit.getINSTANCE();
        LazyInit lazyInit = new LazyInit();
    }
}

