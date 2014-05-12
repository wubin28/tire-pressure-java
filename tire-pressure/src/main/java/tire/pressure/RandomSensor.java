package tire.pressure;

import java.util.Random;

/**
 * Created by benwu on 14-5-12.
 */
public class RandomSensor implements Sensor {
    public static final double OFFSET = 16;

    public double popNextPressurePsiValue()
    {
        double pressureTelemetryValue;
        pressureTelemetryValue = samplePressure( );

        return OFFSET + pressureTelemetryValue;
    }

    private static double samplePressure()
    {
        Random basicRandomNumbersGenerator = new Random();
        double pressureTelemetryValue = 6 * basicRandomNumbersGenerator.nextDouble() * basicRandomNumbersGenerator.nextDouble();
        return pressureTelemetryValue;
    }
}
