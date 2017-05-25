package highlevel;

import lowlevel.Bulb9000;
import lowlevel.Bulb9001;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class Switch9000Test {
    @Test
    public void flipSwitchTest() {
        Switchable bulb9000 = new Bulb9000();
        Switch aSwitch = new Switch9000(bulb9000);

        assertThat(aSwitch.isOn()).isEqualTo(false);
        aSwitch.flip();
        assertThat(aSwitch.isOn()).isEqualTo(true);
        aSwitch.flip();
        assertThat(aSwitch.isOn()).isEqualTo(false);

        Switchable bulb9001 = new Bulb9001();
        aSwitch = new Switch9000(bulb9001);

        assertThat(aSwitch.isOn()).isEqualTo(false);
        aSwitch.flip();
        assertThat(aSwitch.isOn()).isEqualTo(true);
        aSwitch.flip();
        assertThat(aSwitch.isOn()).isEqualTo(false);
    }
}