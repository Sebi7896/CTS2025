package PregatireTest.PregatireTest2.Strategy.Restaurant.clase;

import java.util.List;

public class Meniu {
    private List<OfertaMeniu> ofertaMeniuList;
    private IProcesabil strategieMeniu;
    public Meniu(List<OfertaMeniu> ofertaMeniuList, IProcesabil strategieMeniu) {
        this.ofertaMeniuList = ofertaMeniuList;
        this.strategieMeniu = strategieMeniu;
    }
    public void setStrategieMeniu(IProcesabil strategieMeniu) {
        this.strategieMeniu = strategieMeniu;
    }
    public OfertaMeniu alegereOferta(){
        if(strategieMeniu != null){
            return strategieMeniu.alegeMeniu(ofertaMeniuList);
        }
        else
            throw new UnsupportedOperationException();
    }



}
