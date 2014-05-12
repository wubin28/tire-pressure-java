package tire.pressure;

/**
 * Created by benwu on 14-5-12.
 */
public class StubSensor implements Sensor {
    private double pressureValue;

    public void setPressureValueToBeChecked(double pressureValue) {
        this.pressureValue = pressureValue;
    }

    @Override
    public double popNextPressurePsiValue() {
        return this.pressureValue;
    }

    public void setPressureValuesToBeChecked(double[] pressureValues) {
        for(double pressure : pressureValues) {
            this.queue.offer(pressure);
        }
    }
}
