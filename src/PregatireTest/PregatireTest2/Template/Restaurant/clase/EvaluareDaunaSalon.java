package PregatireTest.PregatireTest2.Template.Restaurant.clase;

public class EvaluareDaunaSalon extends AEvaluareDauna {
    @Override
    public void evalueazaDauna() {
        System.out.println("Se evalueaza dauna pentru Salon");
    }

    @Override
    public void trimiteEvaluareManager() {
        System.out.println("Se trimite la manager dauna din salon...");
    }
}
