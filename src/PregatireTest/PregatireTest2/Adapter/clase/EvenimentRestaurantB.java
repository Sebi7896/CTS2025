package PregatireTest.PregatireTest2.Adapter.clase;

public class EvenimentRestaurantB implements IEvaluareClientFirmaB{
    @Override
    public void evaluareCostEvenimentClientB(Client client) {
        int[] costuriEvenimenteClient = client.getCosturiEvenimente();
        int nrCosturiSub = 0;
        for (int j : costuriEvenimenteClient) {
            if (j < 1500) {
                nrCosturiSub++;
            }
        }
        if(nrCosturiSub < client.getCosturiEvenimente().length/2) {
            System.out.println("Disc 10%");
        }
        System.out.println("Disc 20%");

    }
}
