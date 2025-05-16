package PregatireTest.PregatireTest2.Strategy.AlegerePantofi.clase;

import java.util.Map;

public class CLient implements IClient{
    private ICautare iCautare;
    @Override
    public void alegeStrategie(ICautare iCautare) {
        this.iCautare = iCautare;
    }
    public Map<String,Object> aplicaStrategiaDeCautare() {
        if(iCautare != null) {
            return this.iCautare.alegeStrategieDeCautare();
        }
        return null;
    }
}
