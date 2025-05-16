package PregatireTest.PregatireTest2.Strategy.AlegerePantofi.clase;

import java.util.Map;
import java.util.Scanner;

public class StrategieCautareParametrizata implements ICautare{

    private Scanner scanner;

    public StrategieCautareParametrizata(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Map<String, Object> alegeStrategieDeCautare() {
        System.out.print("Introduce un numar de pantof:");
        int age = scanner.nextInt();
        System.out.print("Introduce o culoare:");
        String culoare = scanner.next();
        return Map.of("nrPantof",age,"culoare",culoare);
    }
}
