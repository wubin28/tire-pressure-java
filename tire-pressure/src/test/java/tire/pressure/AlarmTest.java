package tire.pressure;

import org.junit.Test;

/**
 * Created by benwu on 14-5-12.
 */
public class AlarmTest {
    // TODO-working-on: will the alarm be on if I call the check method
    @Test
    public void will_the_alarm_be_on_if_I_call_the_check_method() {
        assertTrue(alarm.isAlarmOn());
    }
}
