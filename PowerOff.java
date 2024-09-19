public class PowerOff implements Command {
    private Device device;

    public PowerOff(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.powerOff();
    }
}