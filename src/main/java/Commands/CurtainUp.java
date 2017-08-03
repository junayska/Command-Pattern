package Commands;

public class CurtainUp implements ICommand {

    private Curtain curtain;

    public CurtainUp(Curtain curtain) {
        this.curtain = curtain;
    }

    public void execute() {
        curtain.up();
    }
}
