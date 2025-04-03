package builder.variante;

public class VariantaCuInstantiereLaSfarsit {}


interface IBuilderSalariu {

    Salariu build();
}



class BuilderSalariuSf implements IBuilderSalariu {
    private int id;
    private String angajator;
    private float valariu;



    public BuilderSalariuSf setId(int id) {
        this.id = id;
        return this;
    }
    public BuilderSalariuSf setAngajator(String angajator) {
        this.angajator = angajator;
        return this;
    }
    public BuilderSalariuSf setValoare(float valoare) {
        this.valariu = valoare;
        return this;
    }

    @Override
    public Salariu build() {
        Salariu salariu =  new Salariu(id,angajator,valariu);
        //reset(); ca sa nu fie la fel de fiecare data
        return salariu;
    }
}
