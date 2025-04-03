package model.Preparat.FelDeMancare;

import model.Preparat.IPreparatManagement;

import java.util.ArrayList;
import java.util.List;

public class FelDeMancareRepo implements IPreparatManagement<FelDeMancare> {
    private final List<FelDeMancare> feluriDeMancare;
    private FelDeMancareRepo(){
        feluriDeMancare = new ArrayList<>();
    }
    public static final class SingletonHolder{
        private static final FelDeMancareRepo INSTANCE = new FelDeMancareRepo();
    }
    public static FelDeMancareRepo getInstance() {
        return SingletonHolder.INSTANCE;
    }
    @Override
    public void add(FelDeMancare object) {
        feluriDeMancare.add(object);
    }
    @Override
    public void delete(FelDeMancare object) {
        feluriDeMancare.remove(object);
    }
    @Override
    public List<FelDeMancare> getAll() {
        return feluriDeMancare;
    }
    @Override
    public FelDeMancare getItem(int id) {
        return feluriDeMancare.stream().filter(felDeMancare -> felDeMancare.getId() ==  id).findFirst().orElse(null);
    }
    @Override
    public void afisare() {
        feluriDeMancare.forEach(System.out::println);
    }
}
