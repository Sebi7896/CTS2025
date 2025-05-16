package PregatireTest.PregatireTest2.Strategy.Restaurant.clase;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class StrategieCaloriiMinim implements IProcesabil{
    @Override
    public OfertaMeniu alegeMeniu(List<OfertaMeniu> ofertaMeniuList) {
        return ofertaMeniuList.stream().min(Comparator.comparingInt(OfertaMeniu::getNrCalorii)).get();
    }
}
