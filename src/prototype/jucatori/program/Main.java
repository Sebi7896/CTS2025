package prototype.jucatori.program;

import prototype.jucatori.clase.Jucator;
import prototype.jucatori.clase.PrototypeFactory;
import prototype.jucatori.clase.TipJucator;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        try {
            Jucator portar = PrototypeFactory.creeazaJucator(TipJucator.PORTAR,"Andrei");
            Jucator portar2 = PrototypeFactory.creeazaJucator(TipJucator.PORTAR, "Bogdan");
            Jucator atacant = PrototypeFactory.creeazaJucator(TipJucator.ATACANT,"Ronaldo");
            portar2.addAntrenament("antrenament cu mingea");
            portar2.addMedicament("drog de portari");
            System.out.println(portar);
            System.out.println(portar2);
            System.out.println(atacant);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
