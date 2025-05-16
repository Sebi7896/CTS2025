package PregatireTest.PregatireTest2.Facade.Restaurant.clase;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class GestiuneBucatari {

    private List<Bucatar> listaBucatari;

    public GestiuneBucatari() {
        this.listaBucatari=new ArrayList<>();
    }

    public void addBucatar(Bucatar b) {
        this.listaBucatari.add(b);
    }

    public Bucatar getBucatar(int i) {
        return this.listaBucatari.get(i);
    }

    public int getNrBucatari() {
        return this.listaBucatari.size();
    }
}
