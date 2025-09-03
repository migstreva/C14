import org.example.Car;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {

    // String wheelType, String color, String engine, String licensePlate
    @Test
    public void testAutoBrakes() {
        Car car = new Car("chrome", "red", "2.0", "TESTCAR");
        car.autoBrakes(140.0f);
        assertEquals(-5.0f, car.getAcceleration(), 0);
    }

    @Test
    public void testAutoThrottleUp() {
        Car car = new Car("chrome", "red", "2.0", "TESTCAR");
        car.autoThrottleUp(55.0f);
        assertEquals(4.0f, car.getAcceleration(), 0);
    }

    @Test
    public void testLowOilLevelIndicator() {
        Car car = new Car("chrome", "red", "2.0", "TESTCAR");
        car.lowOilLevelIndicator(2.5f);
        assertTrue(car.isLowOil());
    }

    @Test
    public void testTurnOnWindshieldWiper() {
        Car car = new Car("chrome", "red", "2.0", "TESTCAR");
        car.turnOnWindshieldWiper(true);
        assertTrue(car.isWindshieldWiper());
    }

    @Test
    public void testPassengerSeatDetector() {
        Car car = new Car("chrome", "red", "2.0", "TESTCAR");
        car.passengerSeatDetector(30.0f);
        assertTrue(car.isPassengerSeated());
    }

    @Test
    public void testTurnOnSeatbeltsWarning() {
        Car car = new Car("chrome", "red", "2.0", "TESTCAR");
        car.turnOnSeatbeltsWarning(true,false);
        assertTrue(car.isSeatbeltsWarning());
    }
}
