package PregatireTest2.Proxy.Hotel.program;

import PregatireTest2.Proxy.Hotel.clase.Hotel;
import PregatireTest2.Proxy.Hotel.clase.HotelProxy;
import PregatireTest2.Proxy.Hotel.clase.IHotel;
import PregatireTest2.Proxy.Hotel.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Rezervare rezervare= new Rezervare("Ionut",2);
        Rezervare rezervare1= new Rezervare("Mihai",1);
        hotel.addRezervare(rezervare);
        hotel.addRezervare(rezervare1);
        System.out.println("Inainte de proxy!");
        hotel.anulareRezervare(rezervare);
        hotel.veziRezervari();
        System.out.println("Dupa ce managerul a vrut sa se mai rezerve o camera(Proxy)!");
        IHotel hotelProxy = new HotelProxy(hotel);
        hotel.addRezervare(rezervare);
        hotelProxy.anulareRezervare(rezervare);
        hotel.veziRezervari();


    }
}
