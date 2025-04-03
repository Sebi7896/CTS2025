package clase;

public class Manager extends Angajat{

    CalculatorManager calculator = new CalculatorManager();
    public Manager(int id, String nume, float salariulDeBaza) {
        super(id, nume, salariulDeBaza);
    }
}
