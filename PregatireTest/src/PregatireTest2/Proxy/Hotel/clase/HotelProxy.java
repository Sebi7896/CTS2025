package PregatireTest2.Proxy.Hotel.clase;

public class HotelProxy implements  IHotel{
    private Hotel hotel;

    public HotelProxy(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void anulareRezervare(Rezervare rezervare) {
        //managerul vrea doar daca e de o zi
        if(rezervare.getNumarZile() > 1) {
            System.out.println("Nu este permisa anularea acestei rezervari!");
            return;
        }
        this.hotel.anulareRezervare(rezervare);
    }
}
