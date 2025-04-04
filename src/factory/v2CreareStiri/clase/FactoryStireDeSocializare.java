package factory.v2CreareStiri.clase;

import builder.v1pacheteTuristice.clase.IBuilderPachet;
import builder.v1pacheteTuristice.clase.PachetDeVacanta;

public class FactoryStireDeSocializare implements IFactoryStire {


    @Override
    public NewsArticle creareStire(TipStire tipStire, String titlu, String text) throws Exception {
        if(text.length() >= 100) {
            return new StireDeSocializare(text.substring(0,100),titlu);
        }
        return new StireDeSocializare(text, titlu);
    }
}
