package be.intec;

import be.intec.service.FizzBuzzGame;
import be.intec.service.HeaterImpl;
import be.intec.service.ThermometerImpl;
import be.intec.service.Thermostat;

public class Main {
    public static void main(String[] args) {
//        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
//        fizzBuzzGame.play();

        HeaterImpl heater = new HeaterImpl();
        ThermometerImpl thermometer = new ThermometerImpl();

        Thermostat thermostat= new Thermostat(heater, thermometer);
    }
}
