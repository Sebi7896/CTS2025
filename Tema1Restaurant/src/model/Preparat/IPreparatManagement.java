package model.Preparat;

import java.util.List;

public interface IPreparatManagement<T extends Preparat> {

    void add(T object);
    void delete(T object);
    List<T> getAll();
    void afisare();
    T getItem(int id);
}
