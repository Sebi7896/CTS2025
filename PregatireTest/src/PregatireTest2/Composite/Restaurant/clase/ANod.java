package PregatireTest2.Composite.Restaurant.clase;

public abstract class ANod {

    //operations
    public abstract  String getDenumire();
    public abstract  int getPret();
    public String getInfo(){
        return this.getDenumire() + " " + this.getPret();
    }
    //
    public void adaugaNod(ANod elemStructura){
        throw new UnsupportedOperationException();
    }

    public void eliminaNod(ANod elemStructura) {
        throw  new UnsupportedOperationException();
    }
    public ANod getNod(int index) {
        throw new UnsupportedOperationException();
    }

}
