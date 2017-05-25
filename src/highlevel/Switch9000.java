package highlevel;

import lowlevel.Bulb9000;

public class Switch9000 {
    public Bulb9000 bulb;
    public boolean on;

    public Switch9000(Bulb9000 bulb) {
        this.bulb = bulb;
    }

    public boolean isOn() {
        return on;
    }

    public void flip(){
        if (isOn()) {
            bulb.turnOff();
            on = false;
        } else {
            bulb.turnOn();
            on = true;
        }
    }
}
