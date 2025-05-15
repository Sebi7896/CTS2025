package PregatireTest2.Decorator.HotelSarbatori.program;

import PregatireTest2.Decorator.HotelSarbatori.clase.ADecoratorFactura;
import PregatireTest2.Decorator.HotelSarbatori.clase.DecoratorSarbatoriFactura;
import PregatireTest2.Decorator.HotelSarbatori.clase.Factura;
import PregatireTest2.Decorator.HotelSarbatori.clase.IFactura;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        IFactura factura= new Factura("21",200,"Costel");
        System.out.println(factura.printare());
        //aplicam decoratorul pentru sarbatori
        ADecoratorFactura aDecoratorFactura = new DecoratorSarbatoriFactura(factura,0.1f);
        System.out.println(aDecoratorFactura.printare());


        //Ca la IO
        ADecoratorFactura facturareMultipla = new DecoratorSarbatoriFactura(new DecoratorSarbatoriFactura(factura,0.2f),0.2f);
        //BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new ..))


    }
}
