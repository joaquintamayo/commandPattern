public class Thermostat implements Device {

    private int temperature;
    private boolean isOn;

    public Thermostat() {
        this.temperature = 22;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("\nThermostat is now RUNNING.");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("\nThermostat is now OFF.");
    }

    public void setTemperature(int value) {
        if (!isOn) { 
            System.out.println("\nThermostat must be running to set temperature.");
            return;
        }
        if (value < 16 || value > 31) {
            System.out.println("\nTemperature must be set between 16°C and 31°C.");
            return;
        }
        temperature = value;
        System.out.println("\nTemperature set to " + value + "°C.");
    }
}