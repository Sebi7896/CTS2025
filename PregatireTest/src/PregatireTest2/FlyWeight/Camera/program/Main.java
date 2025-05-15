package PregatireTest2.FlyWeight.Camera.program;

import PregatireTest2.FlyWeight.Camera.clase.Camera;
import PregatireTest2.FlyWeight.Camera.clase.ETipInventar;
import PregatireTest2.FlyWeight.Camera.clase.Inventar;
import PregatireTest2.FlyWeight.Camera.clase.InventarFactory;
import PregatireTest2.FlyWeight.Participanti.clase.Bon;
import PregatireTest2.FlyWeight.Participanti.clase.ETipPrintare;
import PregatireTest2.FlyWeight.Participanti.clase.MesajPrintare;
import PregatireTest2.FlyWeight.Participanti.clase.MesajPrintareFactory;

public class Main {
    public static void main(String[] args) {

        Camera camera = new Camera(1,"Ionel");

        Inventar inventar = InventarFactory.getInventar(ETipInventar._3Camere);
        inventar.afisareInventar(camera);//stim ca camera 1 e de tip 3 camere

        //vom refolosi

    }
}
