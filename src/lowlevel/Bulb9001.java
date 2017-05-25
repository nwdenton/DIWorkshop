package lowlevel;

public class Bulb9001 implements highlevel.Switchable {
    @Override
    public void turnOn() {
        System.out.println("Blinded by the light!");
    }
    @Override
    public void turnOff() {
        System.out.println("Still seeing spots!");
    }
}
