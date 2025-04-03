package model.Preparat.Bautura;
import model.Preparat.IPreparatManagement;

import java.util.ArrayList;
import java.util.List;
public class BauturaRepo implements IPreparatManagement<Bautura> {
    private List<Bautura> bauturi;
    private BauturaRepo() {
        bauturi = new ArrayList<>();
    }
    public static final  class  SingletonHelper {
        private static final BauturaRepo INSTANCE = new BauturaRepo();
    }
    public static BauturaRepo getInstance() {
        return SingletonHelper.INSTANCE;
    }
    @Override
    public void add(Bautura object) {
        bauturi.add(object);
    }
    @Override
    public void delete(Bautura object) {
        bauturi.remove(object);
    }
    @Override
    public List<Bautura> getAll() {
        return bauturi;
    }
    @Override
    public Bautura getItem(int id) {
        return bauturi.stream().filter(bautura -> bautura.getId() ==  id).findFirst().orElse(null);
    }
    @Override
    public void afisare() {
        bauturi.forEach(System.out::println);
    }
}
