package PregatireTest.PregatireTest2.Template.Restaurant.clase;

public abstract class AEvaluareDauna {
    //se executa mereu
    private final void identificareDauna() {
        System.out.println("S-a identificat o noua dauna (PAS FIX");
    }
    public abstract void evalueazaDauna();
    public abstract void trimiteEvaluareManager();

    public final void procesareDauna() {
        identificareDauna();
        evalueazaDauna();
        trimiteEvaluareManager();
    }

}
