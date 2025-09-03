import org.example.Plane;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest {

    @Test
    public void turnOnDeIceTest() {
        Plane plane = new Plane();
        plane.turnOnDeIce(-10.0f);
        assertTrue(plane.isDeIceActivated());
    }

    @Test
    public void setGpsDestinationSPTest() {
        Plane plane = new Plane();
        plane.setGpsDestinationSP("Guarulhos");
        assertEquals("SBGR", plane.getGpsDestination());
    }

    @Test
    public void setGpsDestinationRJTest() {
        Plane plane = new Plane();
        plane.setGpsDestinationRJ("Galeao");
        assertEquals("SBGL", plane.getGpsDestination());
    }

    @Test
    public void autoLandingGearTest() {
        Plane plane = new Plane();
        plane.autoLandingGear(3_000.0f);
        assertEquals("Up", plane.getLandingGearStatus());
    }

    @Test
    public void turnOnStallWarningTest(){
        Plane plane = new Plane();
        plane.turnOnStallWarning(220.0f);
        assertFalse(plane.isStallWarning());
    }

    @Test
    public void turnOnOverSpeedWarningTest(){
        Plane plane = new Plane();
        plane.turnOnOverSpeedWarning(300.0f);
        assertFalse(plane.isOverSpeedWarning());
    }

    @Test
    public void setFlapsTest(){
        Plane plane = new Plane();
        plane.setFlapsLevel(220.0f);
        assertEquals(10, plane.getFlapsLevel());
    }

    @Test
    public void setNavLightsOnTest(){
        Plane plane = new Plane();
        plane.setNavLightsOn(0);
        assertFalse(plane.isNavLightsOn());
    }

    @Test
    public void lowFuelWarningTest(){
        Plane plane = new Plane();
        plane.setFuelLevel(10);
        assertEquals("Low Fuel", plane.lowFuelWarning());
    }
}
