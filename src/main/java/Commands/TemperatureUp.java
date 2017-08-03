package Commands;

public class TemperatureUp implements ICommand {

    private Temperature temp;

    public TemperatureUp(Temperature temp) {
        this.temp = temp;
    }

    public void execute() {
        temp.up();
    }
}
