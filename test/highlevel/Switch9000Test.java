package highlevel;

import lowlevel.Bulb9000;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class Switch9000Test {
    @Test
    public void flipSwitchTest() {
        Bulb9000 bulb9000 = new Bulb9000();
        Switch9000 switch9000 = new Switch9000(bulb9000);

        assertThat(switch9000.isOn()).isEqualTo(false);
        switch9000.flip();

        assertThat(switch9000.isOn()).isEqualTo(true);
        switch9000.flip();

        assertThat(switch9000.isOn()).isEqualTo(false);
    }
}