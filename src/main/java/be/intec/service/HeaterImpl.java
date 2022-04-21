package be.intec.service;

public class HeaterImpl implements Heater {

    @Override
    public void trunOn() {
        System.out.println("Heater turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Heater turning off...");
    }
}
