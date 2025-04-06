package singleton.v3Cuptoare.program;

import org.w3c.dom.ls.LSOutput;
import singleton.v3Cuptoare.clase.Cuptor;

public class Main {

    public static void main(String[] args) {
        Cuptor minim_cuptor = Cuptor.repartizareCuptorMinimizat();
        System.out.println(minim_cuptor);
        Cuptor minim_cuptor2 = Cuptor.repartizareCuptorMinimizat();
        System.out.println(minim_cuptor2);

    }
}
