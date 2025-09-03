package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Ship {
    private String engine;
    private String gpsDestination;
    private char compassDirection;

    private boolean fullLoadWarning = false;

    public void turnOnFullLoadWarning(float weight){
        if(weight >= 100_000.0f){
            this.fullLoadWarning = true;
        }
    }

    public String icebergWarning(boolean icebergSpotted){
        if(icebergSpotted){
            return "Iceberg right ahead!";
        }
        return "Everything is fine!";
    }

    public void setGpsDestinationMiami(String port) {
        if(Objects.equals(port, "Miami")){
            this.gpsDestination = "USMIA";
        }
    }

    public void setGpsDestinationLongBeach(String port) {
        if(Objects.equals(port, "Long Beach")){
            this.gpsDestination = "USLGB";
        }
    }

    public void setCompassDirection(String readCompassDirection) {
        switch (readCompassDirection) {
            case "North":
                this.compassDirection = 'N';
                break;
            case "East":
                this.compassDirection = 'E';
                break;
            case "South":
                this.compassDirection = 'S';
                break;
            case "West":
                this.compassDirection = 'W';
                break;
            default:
                break;
        }
    }

}
