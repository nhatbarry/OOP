package kma.NgoaiLeBai2;

public class VirtualPerson{
    private static final int TOOHOT = 85;
    private static final int TOOCOLD = 65;

    void drink (CoffeeCup c) throws TooHotException, TooColdException{
        if (c.getTemperature() >= TOOHOT) {
            throw new TooHotException("nong");
        }
        else if (c.getTemperature() <= TOOCOLD){
            throw new TooColdException("lanh");
        }
    }
}
