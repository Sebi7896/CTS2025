package model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MasaRepo {
    private final Map<String, Boolean> mese;

    private MasaRepo() {
        mese = new ConcurrentHashMap<>();
    }

    private static volatile MasaRepo INSTANCE;

    public static MasaRepo getInstance() {
        if (INSTANCE == null) {
            synchronized (MasaRepo.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MasaRepo();
                }
            }
        }
        return INSTANCE;
    }

    public void addMasa(String masa) {
        this.mese.putIfAbsent(masa, true);
    }

    public void stergeMasa(String masa) {
        mese.computeIfPresent(masa, (key, value) -> {
            if (!value) {
                System.out.println("Masa este ocupata și nu poate fi stearsa!");
                return value;
            }
            return null;
        });
    }

    public void printMese() {
        AtomicInteger index = new AtomicInteger(1);
        mese.forEach((key, value) -> {
            System.out.println(index.getAndIncrement() + ". " + key + " -> " + (value ? "Disponibila" : "Indisponibila"));
        });
    }

    public void setOcupata(String masa, boolean ocupata) {
        mese.computeIfPresent(masa, (k, v) -> ocupata);
    }
}
