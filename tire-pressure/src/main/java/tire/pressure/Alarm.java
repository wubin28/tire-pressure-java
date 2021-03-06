package tire.pressure;

/**
 * Created by benwu on 14-5-12.
 */
public class Alarm {
    public static final double LowPressureThreshold = 17;
    public static final double HighPressureThreshold = 21;

    private Sensor sensor;

    private boolean alarmOn = false;

    public Alarm() {
        this(new RandomSensor());
    }

    public Alarm(Sensor sensor) {
        this.sensor = sensor;
    }

    public void check()
    {
        double psiPressureValue = sensor.popNextPressurePsiValue();

        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue)
        {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn()
    {
        return alarmOn;
    }
}
