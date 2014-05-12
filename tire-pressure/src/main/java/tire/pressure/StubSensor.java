package tire.pressure;

/**
 * Created by benwu on 14-5-12.
 */
public class StubSensor implements Sensor {
    public void setPressureValueToBeChecked(double pressureValue) {

    }

    @Override
    public double popNextPressurePsiValue() {
        return this.pressureValue;
    }
}
