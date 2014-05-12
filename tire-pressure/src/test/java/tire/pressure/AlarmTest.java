package tire.pressure;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by benwu on 14-5-12.
 */
public class AlarmTest {
    // TODO: the alarm will be off if the pressure value is normal
    @Test
    public void the_alarm_will_be_off_if_the_pressure_value_is_normal() {
        // Arrange
        StubSensor stubSensor = new StubSensor();
        stubSensor.setPressureValueToBeChecked(Alarm.LowPressureThreshold);
        // TODO-working-on: Substitute the RandomSensor with StubSensor
        Alarm alarm = new Alarm(stubSensor);

        // Act
        alarm.check();

        // Assert
        assertFalse(alarm.isAlarmOn());
    }

    // TODO: the alarm will be on if the pressure value is out of range
    // TODO: the alarm will still be on if a normal pressure value comes after an out of range one
}
