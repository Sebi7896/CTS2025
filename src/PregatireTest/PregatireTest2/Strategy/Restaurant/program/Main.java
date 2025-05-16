package PregatireTest.PregatireTest2.Strategy.Restaurant.program;

import PregatireTest.PregatireTest2.Strategy.Restaurant.clase.Meniu;
import PregatireTest.PregatireTest2.Strategy.Restaurant.clase.OfertaMeniu;
import PregatireTest.PregatireTest2.Strategy.Restaurant.clase.StrategieCaloriiMinim;
import PregatireTest.PregatireTest2.Strategy.Restaurant.clase.StrategieCarbohidratiMinima;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OfertaMeniu> ofertaMeniuList = new ArrayList<>();
        ofertaMeniuList.add(new OfertaMeniu(3,10,"min"));
        ofertaMeniuList.add(new OfertaMeniu(5,2,"mid"));
        ofertaMeniuList.add(new OfertaMeniu(4,3,"max"));
        Meniu meniu = new Meniu(ofertaMeniuList,new StrategieCaloriiMinim());

        System.out.println(meniu.alegereOferta());
        meniu.setStrategieMeniu(new StrategieCarbohidratiMinima());
        System.out.println(meniu.alegereOferta());

    }
}
