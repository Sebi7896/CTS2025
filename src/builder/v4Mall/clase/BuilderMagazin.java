package builder.v4Mall.clase;


import java.util.ArrayList;
import java.util.List;

public class BuilderMagazin implements IBuilderMagazin {
    private String denumire;
    private float suprafata;
    private int nrIntrari;
    private TipPodea tipPodea = TipPodea.STANDARD;
    private List<Decoratiune> decoratiuni = new ArrayList<>();

    public BuilderMagazin(String denumire, float suprafata, int nrIntrari)  {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
    }
    public BuilderMagazin adaugaTipPodea(TipPodea tipPodea) {
        this.tipPodea = tipPodea;
        return this;
    }
    public BuilderMagazin adaugaDecoratiune(String denumire,TipMaterialDecoratiune tipMaterialDecoratiune) {
        this.decoratiuni.add(new Decoratiune(denumire,tipMaterialDecoratiune));
        return this;
    }

    @Override
    public Magazin build() {
        if(nrIntrari < 1) {
            throw new ExceptiaMagazin("nu poti avea un nr de intrari mai mic decat 1");
        }
        //1 -> 100
        float nrIntrariPerSuprafata =(float) nrIntrari / suprafata;// 0.0075 <  0,01 pentru  1,5 la  200 cand trebuie sa aiba minim 2
        if(nrIntrariPerSuprafata < 0.01f) {
            throw  new ExceptiaMagazin("nu pot exista mai puțin de 1 intrări per 100 mp de magazin");
        }
        //Podea moale
        if(tipPodea == TipPodea.MOALE) {
            decoratiuni.forEach(decoratiune -> {
                if(decoratiune.getTipMaterialDecoratiune() == TipMaterialDecoratiune.STICLA) {
                    throw new ExceptiaMagazin("Nu putem avea decoratiuni de sticla la o podea moale");
                }
            });
        }
        //calculul se face intr o alta clasa



        Magazin mall = new Magazin(denumire,suprafata,nrIntrari);
        mall.setTipPodea(tipPodea);
        mall.setDecoratiuni(decoratiuni);
        resetare();
        return mall;
    }

    private void resetare() {
        tipPodea = TipPodea.STANDARD;
        decoratiuni = new ArrayList<>();
    }
}
