package org.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Car {
    private final String wheelType;
    private final String color;
    private final String engine;
    private final String licensePlate;

    private float acceleration = 0.0f;
    private float speed = 0.0f;
    private float oilLevel = 0.0f;

    private boolean lowOil = false;
    private boolean windshieldWiper = false;
    private boolean passengerSeated  = false;
    private boolean seatbeltsFastened = false;
    private boolean seatbeltsWarning = false;

    public void autoBrakes(float speed){
        if(speed >= 120){
            this.acceleration = -5.0f;
        }
    }

    public void autoThrottleUp(float speed){
        if(speed <= 60){
            this.acceleration = 4.0f;
        }
    }

    public void lowOilLevelIndicator(float oilLevel){
        if(oilLevel < 3.0f){
            this.lowOil = true;
        }
    }

    public void turnOnWindshieldWiper(boolean isItRaining){
        if(isItRaining){
            this.windshieldWiper = true;
        }
    }

    public void passengerSeatDetector(float weight){
        if(weight >= 20.0f){
            this.passengerSeated = true;
        }
    }

    public void turnOnSeatbeltsWarning(boolean passengerSeated, boolean seatbeltsFastened){
        if(passengerSeated && !(seatbeltsFastened)){
            this.seatbeltsWarning = true;
        }
    }
}
