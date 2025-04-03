package builder.variante;

public class VariantaCuInstantiereLaInceput {
}

interface IBuilder {
    Salariu build();
    BuilderSalariu reset(int id);
}

class BuilderSalariu implements IBuilder {
    //daca avem instantiere la inceput putem folosi chiar instanta unui Salariu
    private Salariu salariu;

    //obligatoriu id
    BuilderSalariu(int id) {
        salariu = new Salariu(id);
    }

    public BuilderSalariu setId(int id) {
        salariu.setId(id);
        return this;
    }
    public BuilderSalariu setAngajator(String angajator) {
        salariu.setAngajator(angajator);
        return this;
    }
    public BuilderSalariu setValoare(float valoare) {
        salariu.setValariu(valoare);
        return this;
    }


    @Override
    public Salariu build() {
        //o sa avem shallow
        return salariu;
    }

    @Override
    public BuilderSalariu reset(int id) {
        salariu = new Salariu(id);
        return this;
    }
}

class Main {
    public static void main(String[] args) {
        BuilderSalariu builderSalariu = new BuilderSalariu(2);
        Salariu salariu = builderSalariu.setAngajator("eu").setId(2).build();
        System.out.println(salariu);
        Salariu salariu1 = builderSalariu.reset(2).build();
        System.out.println(salariu1);
    }
}


