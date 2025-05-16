package PregatireTest.PregatireTest2.Proxy.Hotel.clase;

import java.util.ArrayList;
import java.util.List;

public class Hotel implements IHotel{
    private List<Rezervare> rezervariHotel;

    public Hotel() {
        rezervariHotel = new ArrayList<>();
    }
    public void addRezervare(Rezervare rezervare) {
        rezervariHotel.add(rezervare);
    }
    @Override
    public void anulareRezervare(Rezervare rezervare) {
        if(rezervariHotel.contains(rezervare)) {
            this.rezervariHotel.remove(rezervare);
        } else {
            System.out.println("Nu exista aceasta rezervare!");
        }

    }
    public void veziRezervari() {
        rezervariHotel.forEach(System.out::println);
    }
}
