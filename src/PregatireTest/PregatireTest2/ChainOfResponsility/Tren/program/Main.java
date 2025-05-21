package PregatireTest.PregatireTest2.ChainOfResponsility.Tren.program;

import PregatireTest.PregatireTest2.ChainOfResponsility.Tren.clase.ADecoratorTrainRoute;
import PregatireTest.PregatireTest2.ChainOfResponsility.Tren.clase.AbstractTrainRoute;
import PregatireTest.PregatireTest2.ChainOfResponsility.Tren.clase.FacadeGara;
import PregatireTest.PregatireTest2.ChainOfResponsility.Tren.clase.RegioExpressDecorator;

public class Main {
    public static void main(String[] args) {
        AbstractTrainRoute facadeGara = new FacadeGara();
        //prima tura
       facadeGara.alegeRutaDePornire(90);
       facadeGara.alegeRutaDePornire(110);
       facadeGara.alegeRutaDePornire(510);


       //decorator peste
        ADecoratorTrainRoute aDecoratorTrainRoute = new RegioExpressDecorator(facadeGara);
        aDecoratorTrainRoute.alegeRutaDePornire(90);
    }
}
