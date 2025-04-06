package builder.v4Mall.clase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Magazin {
    private String denumire;
    private float suprafata;
    private int nrIntrari;
    private TipPodea tipPodea;
    private List<Decoratiune> decoratiuni;
    Magazin(String denumire, float suprafata, int nrIntrari) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getSuprafata() {
        return suprafata;
    }

    public int getNrIntrari() {
        return nrIntrari;
    }

    public TipPodea getTipPodea() {
        return tipPodea;
    }
    void setTipPodea(TipPodea tipPodea) {
        this.tipPodea = tipPodea;
    }

    void setDecoratiuni(List<Decoratiune> decoratiuni) {
        this.decoratiuni = decoratiuni;
    }

    public int getSumaTipDecoratiuni() {
        if(this.decoratiuni.isEmpty()) {
            return 1; // este sigur 100% pt ca nu avem nicio decoratiune
        }
        return decoratiuni.stream().flatMapToInt(decoratiune -> IntStream.of(decoratiune.getTipMaterialDecoratiune().getGradIncendiu())).sum();
    }
    public int getLungimeDecoratiuniPentruISU() {
        if(this.decoratiuni.isEmpty()) {
            return 1;
        }

        int gradMaxim = Arrays.stream(TipMaterialDecoratiune.values()).max(new Comparator<TipMaterialDecoratiune>() {
            @Override
            public int compare(TipMaterialDecoratiune o1, TipMaterialDecoratiune o2) {
                return Integer.compare(o1.getGradIncendiu(),o2.getGradIncendiu());
            }
        }).get().getGradIncendiu();//gradul maxim al celui mai ok tip

        return gradMaxim * decoratiuni.size();
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", suprafata=" + suprafata +
                ", nrIntrari=" + nrIntrari +
                ", tipPodea=" + tipPodea +
                ", decoratiuni=" + decoratiuni +
                '}';
    }
}
