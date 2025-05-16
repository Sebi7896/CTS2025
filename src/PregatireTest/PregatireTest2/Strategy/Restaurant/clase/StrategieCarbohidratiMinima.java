package PregatireTest.PregatireTest2.Strategy.Restaurant.clase;

import java.util.Comparator;
import java.util.List;

public class StrategieCarbohidratiMinima implements IProcesabil{

    @Override
    public OfertaMeniu alegeMeniu(List<OfertaMeniu> ofertaMeniuList) {
        return ofertaMeniuList.stream().min(Comparator.comparingInt(OfertaMeniu::getNrCarbohidrati)).get();
    }
}
