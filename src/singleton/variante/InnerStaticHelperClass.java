package singleton.variante;

import java.net.Inet4Address;

public class InnerStaticHelperClass {

    private static InnerStaticHelperClass INSTANCE;

    private InnerStaticHelperClass() {}

    private static final class InnerHelper {
        private static final InnerStaticHelperClass INSTANCE = new InnerStaticHelperClass();
    }
    public static InnerStaticHelperClass getINSTANCE() {
        return InnerHelper.INSTANCE;
    }

}

class Main {
    public static void main(String[] args) {
        InnerStaticHelperClass innerStaticHelperClass = InnerStaticHelperClass.getINSTANCE();
        InnerStaticHelperClass innerStaticHelperClass2 = InnerStaticHelperClass.getINSTANCE();
        if(innerStaticHelperClass2 == innerStaticHelperClass) {
            System.out.println("egale");
        }
    }
}
