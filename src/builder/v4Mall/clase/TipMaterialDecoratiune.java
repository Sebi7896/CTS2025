package builder.v4Mall.clase;

public enum  TipMaterialDecoratiune {
    STICLA(2),
    LEMN(1),
    METAL(3);
    private int gradIncendiu;
    TipMaterialDecoratiune(int gradDeIncendiu) {
        this.gradIncendiu = gradDeIncendiu;
    }

    public int getGradIncendiu() {
        return gradIncendiu;
    }
}
