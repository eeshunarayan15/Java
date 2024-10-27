package Garage;

import car.Car;

public class Factory {
    public void factory( Car c){

        c.colors();
        c.mileage();
        c.engineType();

        c.seat();
        c.speed();
    }

}
