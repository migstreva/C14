import org.example.Ship;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShipTest {

    @Test
    public void fullLoadWarningTest(){
        Ship ship = new Ship();
        ship.turnOnFullLoadWarning(180_000.0f);
        assertTrue(ship.isFullLoadWarning());
    }

    @Test
    public void icebergWarningTest(){
        Ship ship = new Ship();
        assertEquals("Iceberg right ahead!", ship.icebergWarning(true));
    }

    @Test
    public void setGpsDestinationMiamiTest(){
        Ship ship = new Ship();
        ship.setGpsDestinationMiami("Miami");
        assertEquals("USMIA", ship.getGpsDestination());
    }


    @Test
    public void setGpsDestinationLongBeachTest(){
        Ship ship = new Ship();
        ship.setGpsDestinationLongBeach("Long Beach");
        assertEquals("USLGB", ship.getGpsDestination());
    }

    @Test
    public void setCompassDirectionTest(){
        Ship ship = new Ship();
        ship.setCompassDirection("South");
        assertEquals('S', ship.getCompassDirection());
    }
}
