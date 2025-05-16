package PregatireTest.PregatireTest2.Adapter.clase;

public class AdapterEvaluareClient extends EvenimentRestaurantA implements IEvaluareClientFirmaB{

    //adapter pe clase prin extends
    public int costTotalEvenimente(Client client){
        int costTotalEvenimente = 0;
        for(int i=0; i<client.getCosturiEvenimente().length; i++)
            costTotalEvenimente += client.getCosturiEvenimente()[i];
        return costTotalEvenimente;
    }

    @Override
    public void evaluareCostEvenimentClientB(Client client) {
        this.evaluareCostEvenimentClientA(costTotalEvenimente(client));
    }
}
