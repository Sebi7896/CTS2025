package PregatireTest.PregatireTest2.Template.Restaurant.program;

import PregatireTest.PregatireTest2.Template.Restaurant.clase.AEvaluareDauna;
import PregatireTest.PregatireTest2.Template.Restaurant.clase.EvaluareDaunaBucatarie;
import PregatireTest.PregatireTest2.Template.Restaurant.clase.EvaluareDaunaSalon;

public class Main {
    public static void main(String[] args) {
        AEvaluareDauna evaluareDauna = new EvaluareDaunaBucatarie();
        evaluareDauna.procesareDauna();

        evaluareDauna = new EvaluareDaunaSalon();
        evaluareDauna.procesareDauna();
    }
}
