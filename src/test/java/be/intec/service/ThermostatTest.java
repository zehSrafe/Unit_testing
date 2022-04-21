package be.intec.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThermostatTest {
    @Test
    void triggerOnTest() {
        // class created in order to check if method has been called. cannot access variables from anonymous nested class
        final BooleanWrapper methodIsCalled = new BooleanWrapper(false);

        Heater heater = new Heater() {
            @Override
            public void trunOn() {
                methodIsCalled.setValue(true);
            }

            @Override
            public void turnOff() {
                methodIsCalled.setValue(true);
            }
        };

        Thermometer thermometer = new Thermometer() {
            @Override
            public int getTemperature() {
                return 18;
            }
        };

        Thermostat thermostat = new Thermostat(heater, thermometer);

        thermostat.setTriggerTemperature(18);
        thermostat.checkTemp();
        assertEquals(true, methodIsCalled.getValue());
    }

    @Test
    void triggerOffTest() {
        // class created in order to check if method has been called. cannot access variables from anonymous nested class
        final BooleanWrapper methodIsCalled = new BooleanWrapper(false);

        Heater heater = new Heater() {
            @Override
            public void trunOn() {
                methodIsCalled.setValue(true);
            }

            @Override
            public void turnOff() {
                methodIsCalled.setValue(true);
            }
        };

        Thermometer thermometer = new Thermometer() {
            @Override
            public int getTemperature() {
                return 22;
            }
        };

        Thermostat thermostat = new Thermostat(heater, thermometer);

        thermostat.setTriggerTemperature(18);
        thermostat.checkTemp();
        assertEquals(true, methodIsCalled.getValue());
    }
}