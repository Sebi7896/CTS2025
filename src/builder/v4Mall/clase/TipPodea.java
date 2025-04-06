package builder.v4Mall.clase;

public enum TipPodea {
    STANDARD(2),
    DURA(3),
    MOALE(1);
    private int duritate;
    TipPodea(int duritate) {
        this.duritate =duritate;
    }

    public int getDuritate() {
        return duritate;
    }
}
