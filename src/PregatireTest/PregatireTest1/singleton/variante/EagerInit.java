package PregatireTest.PregatireTest1.singleton.variante;

public class EagerInit {
    public static final EagerInit INSTANCE = new EagerInit();

    private EagerInit() {
    }

    public static EagerInit getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        EagerInit eagerInit = EagerInit.getInstance();
        EagerInit eagerInit1 = EagerInit.getInstance();
        if(eagerInit1 == eagerInit) {
            System.out.println("sunt egale");
        }
    }
}

