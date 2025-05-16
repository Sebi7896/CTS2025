package PregatireTest.PregatireTest2.Strategy.AlegerePantofi.program;

import PregatireTest.PregatireTest2.Strategy.AlegerePantofi.clase.CLient;
import PregatireTest.PregatireTest2.Strategy.AlegerePantofi.clase.StrategieCautareImplicita;
import PregatireTest.PregatireTest2.Strategy.AlegerePantofi.clase.StrategieCautareParametrizata;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //permite clientului sa aleaga la generarea implicita sau explicita a parametriilore
        CLient cLient = new CLient();
        cLient.alegeStrategie(new StrategieCautareImplicita());
        System.out.println(cLient.aplicaStrategiaDeCautare());

        cLient.alegeStrategie(new StrategieCautareParametrizata(new Scanner(System.in)));
        System.out.println(cLient.aplicaStrategiaDeCautare());
    }
}
