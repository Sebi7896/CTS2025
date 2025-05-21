package PregatireTest.PregatireTest2.ChainOfResponsility.Tren.clase;

public class RegioExpressDecorator extends ADecoratorTrainRoute{
    private boolean esteDisponibil  = true;
    public RegioExpressDecorator(AbstractTrainRoute trainRoute) {
        super(trainRoute);
    }

    public void setEsteDisponibil(boolean esteDisponibil) {
        this.esteDisponibil = esteDisponibil;
    }

    @Override
    public void alegeRutaDePornire(int nrKmATotali) {

        if(nrKmATotali < 100 && esteDisponibil) {
            esteDisponibil = false;
            System.out.println("Alegem trenul regio-express peste regio!");
            return;
        }


        super.alegeRutaDePornire(nrKmATotali);
    }
}
