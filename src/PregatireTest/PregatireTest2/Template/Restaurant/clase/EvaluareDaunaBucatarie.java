package PregatireTest.PregatireTest2.Template.Restaurant.clase;

public class EvaluareDaunaBucatarie extends AEvaluareDauna{
    private String dauna;

    @Override
    public void evalueazaDauna() {
        System.out.println("Se evalueaza pentru dauna pentru Bucatarie");
    }

    @Override
    public void trimiteEvaluareManager() {
        System.out.println("Se trimite dauna din bucatarie la manager..");
    }
}
