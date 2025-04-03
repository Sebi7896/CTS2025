package program;

import clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Angajat> angajats = new ArrayList<>();

        angajats.add(new Manager(1,"Andrei" , 200));
        angajats.add(new Lucrator(1,"Andrei" ,  200));
        for (Angajat angajat : angajats) {
            System.out.println();
        }
    }
}