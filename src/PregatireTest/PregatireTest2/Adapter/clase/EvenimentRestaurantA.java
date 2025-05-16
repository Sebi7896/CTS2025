package PregatireTest.PregatireTest2.Adapter.clase;

public class EvenimentRestaurantA implements IEvaluareClientFirmaA{



    @Override
    public void evaluareCostEvenimentClientA(int costTotal) {
        if(costTotal > 100) {
            System.out.println("Disc de 10%");
            return;
        }
        System.out.println("Disc de 20%");
    }
}
