package tire.pressure;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by benwu on 14-5-12.
 */
public class AlarmTest {
    @Test
    public void the_alarm_will_be_off_if_the_pressure_value_is_normal() {
        // Arrange
        StubSensor stubSensor = new StubSensor();
        stubSensor.setPressureValueToBeChecked(Alarm.LowPressureThreshold);
        Alarm alarm = new Alarm(stubSensor);

        // Act
        alarm.check();

        // Assert
        assertFalse(alarm.isAlarmOn());
    }

    // TODO: the alarm will be on if the pressure value is out of range
    @Test
    public void the_alarm_will_be_on_if_the_pressure_value_is_out_of_range() {
        // Arrange
        StubSensor stubSensor = new StubSensor();
        stubSensor.setPressureValueToBeChecked(Alarm.LowPressureThreshold - 1);
        Alarm alarm = new Alarm(stubSensor);

        // Act
        alarm.check();

        // Assert
        assertTrue(alarm.isAlarmOn());
    }

    // TODO: the alarm will still be on if a normal pressure value comes after an out of range one
}
