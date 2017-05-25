package highlevel;

public class Switch9000 implements Switch {
    public Switchable switchable;
    public boolean on;

    public Switch9000(Switchable switchable) {
        this.switchable = switchable;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void flip(){
        if (isOn()) {
            switchable.turnOff();
            on = false;
        } else {
            switchable.turnOn();
            on = true;
        }
    }
}
