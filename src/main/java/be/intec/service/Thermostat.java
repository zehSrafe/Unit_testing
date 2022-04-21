package be.intec.service;

public class Thermostat {
    private Heater heater = new HeaterImpl();
    private Thermometer thermometer = new ThermometerImpl();
    private int triggerTemperature;

    public Thermostat(Heater heater, Thermometer thermometer) {
        this.heater = heater;
        this.thermometer = thermometer;
    }

    public void setTriggerTemperature(int temp) {
        this.triggerTemperature = temp;
    }

    public void checkTemp() {
        if (thermometer.getTemperature() <= this.triggerTemperature) {
            this.heater.trunOn();
        } else if (thermometer.getTemperature() >= this.triggerTemperature + 2) {
            this.heater.turnOff();
        }
    }
}
