package PregatireTest.PregatireTest2.Composite.Restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Structura extends ANod {
    List<ANod> structura = new ArrayList<>();
    String numeStructura; //eticheta

    public Structura(String numeStructura) {
        this.numeStructura = numeStructura;
    }


    @Override
    public String getDenumire() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getPret() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append(this.numeStructura).append("\n");
        for(ANod aNod : structura) {
            info.append(aNod.getInfo()).append("\n");
        }
        return info.toString();
    }

    @Override
    public void adaugaNod(ANod elemStructura) {structura.add(elemStructura);
    }

    @Override
    public void eliminaNod(ANod elemStructura) {
        structura.remove(elemStructura);
    }

    @Override
    public ANod getNod(int index) {
        if(index <0 || index > structura.size()) {
            throw new IndexOutOfBoundsException();
        }
        return structura.get(index);
    }
}
