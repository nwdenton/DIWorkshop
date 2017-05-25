package lowlevel;

public class Bulb9000 implements highlevel.Switchable {
    @Override
    public void turnOn() {
        System.out.println("Let me risk a little more light.");
    }
    @Override
    public void turnOff() {
        System.out.println("We must face the long dark of Moria. Be on your guard.");
    }
}
