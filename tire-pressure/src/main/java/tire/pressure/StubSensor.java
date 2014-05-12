package tire.pressure;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by benwu on 14-5-12.
 */
public class StubSensor implements Sensor {
    private Queue<Double> queue = new ArrayDeque<Double>();

    public void setPressureValueToBeChecked(double pressureValue) {
        this.queue.offer(pressureValue);
    }

    @Override
    public double popNextPressurePsiValue() {
        return this.queue.poll();
    }

    public void setPressureValuesToBeChecked(double[] pressureValues) {
        for(double pressure : pressureValues) {
            this.queue.offer(pressure);
        }
    }
}
