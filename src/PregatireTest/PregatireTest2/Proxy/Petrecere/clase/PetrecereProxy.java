package PregatireTest.PregatireTest2.Proxy.Petrecere.clase;

public class PetrecereProxy implements IPetrecere{
    private Petrecere petrecere;

    public PetrecereProxy(Petrecere petrecere) {
        this.petrecere = petrecere;
    }
    @Override
    public void adaugaParticipantPetrecere(Client client) {
        if(client.getVarsta() < 18) {
            System.out.println("Nu este permisa adaugarea de clienti sub 18 ani!");
            return;
        }
        petrecere.adaugaParticipantPetrecere(client);
    }

    @Override
    public void afisarePetreceri() {
        this.petrecere.afisarePetreceri();
    }
}
