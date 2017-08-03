package Commands;

public class LightDown implements ICommand {

    private Light light;

    public LightDown(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
