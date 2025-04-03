package model.Preparat.FelDeMancare;

import model.Preparat.Preparat;

public class FelDeMancare extends Preparat {
    private boolean vegetarian;
   public FelDeMancare(int id, String nume, int cost,boolean vegetarian) {
       super(id,nume,cost);
       this.vegetarian = vegetarian;
   }
   public boolean isVegetarian() {
       return vegetarian;
   }
   public void setVegetarian(boolean vegetarian) {
       this.vegetarian = vegetarian;
   }

    @Override
    public String toString() {
        return "id=" + this.getId() +
                ", nume='" + this.getNume() + '\'' +
                ", cost=" + this.getCost() + " lei";
    }
}
