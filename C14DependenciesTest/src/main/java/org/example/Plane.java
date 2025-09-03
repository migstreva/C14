package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Plane {
    private String engine;
    private String flightStick;
    private String gpsOrigin;
    private String gpsDestination;
    private String landingGearStatus;
    private int flapsLevel;
    private int fuelLevel;

    private boolean navLightsOn = false;
    private boolean deIceActivated = false;
    private boolean stallWarning = false;
    private boolean overSpeedWarning = false;

    public void turnOnDeIce(float readTemperature){
        if (readTemperature < -5.0f){
            this.deIceActivated = true;
        }
    }

    public void setGpsDestinationSP(String airport) {
        if(Objects.equals(airport, "Guarulhos")){
            this.gpsDestination = "SBGR";
        }
    }

    public void setGpsDestinationRJ(String airport) {
        if(Objects.equals(airport, "Galeao")){
            this.gpsDestination = "SBGL";
        }
    }

    public void autoLandingGear(float altitudeFromGround){
        if(altitudeFromGround > 2_000.0f){
            this.landingGearStatus = "Up";
        }
        else{
            this.landingGearStatus = "Down";
        }
    }

    public void turnOnStallWarning(float readSpeed){
        if(readSpeed < 160.0f){
            this.stallWarning = true;
        }
    }

    public void turnOnOverSpeedWarning(float readSpeed){
        if(readSpeed > 360.0f){
            this.overSpeedWarning = true;
        }
    }

    public void setFlapsLevel(float readSpeed){
        if(readSpeed < 230.0f ){
            this.flapsLevel = 10;
        }
    }

    public void setNavLightsOn(float readAltitudeFromGround){
        if(readAltitudeFromGround > 0.0f){
            this.navLightsOn = true;
        }
    }

    public String lowFuelWarning(){
        if(this.fuelLevel <= 20){
            return "Low Fuel";
        }
        return "Fuel OK";
    }
}
