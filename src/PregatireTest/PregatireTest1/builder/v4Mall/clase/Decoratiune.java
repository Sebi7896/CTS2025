package PregatireTest.PregatireTest1.builder.v4Mall.clase;

public class Decoratiune {
    private String denumire;
    private TipMaterialDecoratiune tipMaterialDecoratiune;

    Decoratiune(String denumire, TipMaterialDecoratiune tipMaterialDecoratiune) {
        this.denumire = denumire;
        this.tipMaterialDecoratiune = tipMaterialDecoratiune;
    }

    public TipMaterialDecoratiune getTipMaterialDecoratiune() {
        return tipMaterialDecoratiune;
    }

    @Override
    public String toString() {
        return "Decoratiune{" +
                "denumire='" + denumire + '\'' +
                ", tipMaterialDecoratiune=" + tipMaterialDecoratiune +
                '}';
    }
}
