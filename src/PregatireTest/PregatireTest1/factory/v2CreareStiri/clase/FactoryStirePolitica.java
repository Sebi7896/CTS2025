package PregatireTest.PregatireTest1.factory.v2CreareStiri.clase;

public class FactoryStirePolitica implements IFactoryStire{


    @Override
    public NewsArticle creareStire(TipStire tipStire, String titlu, String text) throws Exception {
        if(tipStire == TipStire.POLITICA) {
            return new StirePolitica(text,titlu);
        }
        throw new Exception("Nu se poate");
    }
}
