package PregatireTest.PregatireTest2.ChainOfResponsility.Restaurant.program;

import PregatireTest.PregatireTest2.ChainOfResponsility.Restaurant.clase.Bucatar;
import PregatireTest.PregatireTest2.ChainOfResponsility.Restaurant.clase.Comanda;
import PregatireTest.PregatireTest2.ChainOfResponsility.Restaurant.clase.Ospatar;

import java.nio.charset.CoderMalfunctionError;

public class Main {

    public static void main(String[] args) {
        Comanda comanda = new Comanda("ceva",3,21);

        Ospatar ospatar = new Ospatar();
        ospatar.setNextHandler(new Bucatar());

        ospatar.procesareComanda(comanda);

    }
}
