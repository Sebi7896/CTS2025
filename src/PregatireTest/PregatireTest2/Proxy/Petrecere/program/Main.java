package PregatireTest.PregatireTest2.Proxy.Petrecere.program;

import PregatireTest.PregatireTest2.Proxy.Petrecere.clase.Client;
import PregatireTest.PregatireTest2.Proxy.Petrecere.clase.Petrecere;
import PregatireTest.PregatireTest2.Proxy.Petrecere.clase.PetrecereProxy;

public class Main {
    public static void main(String[] args) {
        Petrecere petrecere = new Petrecere();
        petrecere.adaugaParticipantPetrecere(new Client(5,"Ionel"));
        petrecere.adaugaParticipantPetrecere(new Client(19,"Cristi"));
        System.out.println("Inainte de proxy");
        petrecere.afisarePetreceri();
        System.out.println("Dupa proxy");
        PetrecereProxy petrecereProxy = new PetrecereProxy(petrecere);
        petrecereProxy.adaugaParticipantPetrecere(new Client(19,"BIlly"));
        petrecereProxy.adaugaParticipantPetrecere(new Client(5,"Ionel"));
        petrecereProxy.afisarePetreceri();



    }
}
