package clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;

	public Angajat(String nume, String prenume, int varsta,int puncte) {
		super(nume,prenume,varsta,puncte);

	}

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr, String[] vect, int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, nr, vect);
		this.ocupatie = ocupatie;
		this.salariu = salariu;
	}

	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(int salariu,String ocupatie) {
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	
	
	@Override
	public String toString() {
		return "Angajat: Nume=" + nume + ", Prenume=" + prenume
				+ ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nr_proiecte + ", DenumireProiect="
				+ Arrays.toString(denumireProiect) + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}


	public int finantare() {

		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primește " + 10 + " Euro/zi în proiect.");
		return 10;
	}
}
