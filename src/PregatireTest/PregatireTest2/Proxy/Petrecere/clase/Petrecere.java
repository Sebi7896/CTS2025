package PregatireTest.PregatireTest2.Proxy.Petrecere.clase;

import java.util.ArrayList;
import java.util.List;

public class Petrecere implements IPetrecere{
    private List<Client> candidatiPetrecere;
    public Petrecere() {
        candidatiPetrecere = new ArrayList<>();
    }

    @Override
    public void adaugaParticipantPetrecere(Client client) {
        candidatiPetrecere.add(client);
    }

    @Override
    public void afisarePetreceri() {
        candidatiPetrecere.forEach(System.out::println);
    }
}
