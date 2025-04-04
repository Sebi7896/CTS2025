package factory.v2CreareStiri.clase;

public class FactoryStireEconomica implements  IFactoryStire{


    @Override
    public NewsArticle creareStire(TipStire tipStire,String titlu,String text) throws Exception {
        if(tipStire == TipStire.ECONOMIE) {
            return new StireEconomica(titlu,text);
        }
        throw new Exception("Nu avem tipul acesta");
    }
}
