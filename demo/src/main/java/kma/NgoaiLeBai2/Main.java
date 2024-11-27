package kma.NgoaiLeBai2;

public class Main {
    public static void main(String[] args) throws TooHotException, TooColdException {
        CoffeeCup c = new CoffeeCup();
        c.setTemperature(0);
        VirtualPerson p = new VirtualPerson();
        p.drink(c);
    }
}
