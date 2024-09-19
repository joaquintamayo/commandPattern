public class SetBrightness implements Command {
    private Lights lights;
    private int brightness;

    public SetBrightness(Lights lights, int brightness) {
        this.lights = lights;
        this.brightness = brightness;
    }

    @Override
    public void execute() {
        lights.setBrightness(brightness);
    }
}
