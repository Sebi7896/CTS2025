package PregatireTest.PregatireTest2.Adapter.program;

import PregatireTest.PregatireTest2.Adapter.clase.*;

class Main {

    public static void main(String[] args) {
        //A
        IEvaluareClientFirmaA evaluareClientFirmaA = new EvenimentRestaurantA();
        evaluareClientFirmaA.evaluareCostEvenimentClientA(200);

        //B
        IEvaluareClientFirmaB evaluareClientFirmaB = new EvenimentRestaurantB();
        evaluareClientFirmaB.evaluareCostEvenimentClientB(new Client("Ionel",new int[]{2,1,2,20000}));

        //Adapter se comporta ca evaluareClientFirma
        IEvaluareClientFirmaB evaluareClientFirmaA1 = new AdapterEvaluareClient();
        evaluareClientFirmaA1.evaluareCostEvenimentClientB(new Client("sdas",new int[]{2,1,2,20000}));



    }
}