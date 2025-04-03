package model.Comanda;

//0 -> bautura
//1 -> mancare
public enum CategorieComanda {
    BAUTURA(new int[]{0}),
    MANCARE(new int[]{1}),
    MANCARE_BAUTURA(new int[]{0, 1});

    private int[] codes;

    CategorieComanda(int[] codes) {
        this.codes = codes;
    }

    public int[] getCodes() {
        return codes;
    }
}
