package tire.pressure;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by benwu on 14-5-12.
 */
public class AlarmTest {
    // TODO-working-on: will the alarm be on if I call the check method
    @Test
    public void will_the_alarm_be_on_if_I_call_the_check_method() {
        // Arrange
        Alarm alarm = new Alarm();

        // Act
        alarm.check();

        // Assert
        assertFalse(alarm.isAlarmOn());
    }
}
