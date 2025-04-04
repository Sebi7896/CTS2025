package factory.v2CreareStiri.program;

import factory.v2CreareStiri.clase.*;

import java.util.HashMap;

public class MAIN {
    public static void main(String[] args) throws Exception {
        IFactoryStire iFactoryStire = new FactoryStireEconomica();
        StireEconomica stireEconomica =(StireEconomica) iFactoryStire.creareStire(TipStire.ECONOMIE,"Economie","sadfasdasdas");
        stireEconomica.setNumarAudienta("233");
        System.out.println(stireEconomica);


        iFactoryStire = new FactoryStirePolitica();
        StirePolitica stirePolitica = (StirePolitica) iFactoryStire.creareStire(TipStire.POLITICA,"Politica","Nu prea");
        System.out.println(stirePolitica);

        iFactoryStire = new FactoryStireDeSocializare();
        StireDeSocializare stireDeSocializare = (StireDeSocializare) iFactoryStire.creareStire(TipStire.RETEADESOCIALIZARE,"ddas","asdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadasssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss2");
        System.out.println(stireDeSocializare);

    }
}
