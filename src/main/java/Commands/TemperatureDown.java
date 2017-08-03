package Commands;

public class TemperatureDown implements ICommand {

    private Temperature temp;

    public TemperatureDown(Temperature temp) {
        this.temp = temp;
    }

    public void execute() {
        temp.down();
    }
}
