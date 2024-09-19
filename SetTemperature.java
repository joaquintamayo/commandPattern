public class SetTemperature implements Command {
    private Thermostat thermostat;
    private int temperature;

    public SetTemperature(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        thermostat.setTemperature(temperature);
    }
}
