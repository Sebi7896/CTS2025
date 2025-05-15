package PregatireTest2.FlyWeight.Participanti.program;

import PregatireTest2.FlyWeight.Participanti.clase.Bon;
import PregatireTest2.FlyWeight.Participanti.clase.ETipPrintare;
import PregatireTest2.FlyWeight.Participanti.clase.MesajPrintare;
import PregatireTest2.FlyWeight.Participanti.clase.MesajPrintareFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bon");


        MesajPrintare mesajPrintare1 =  MesajPrintareFactory.getMesajPrintare(ETipPrintare.TIP1);
        mesajPrintare1.printareBon(new Bon(2,200));
        MesajPrintare mesajPrintare = MesajPrintareFactory.getMesajPrintare(ETipPrintare.TIP2);
        mesajPrintare.printareBon(new Bon(3,1));
    }
}
