package Commands;

public class LightUp implements ICommand {

    private Light light;

    public LightUp(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
