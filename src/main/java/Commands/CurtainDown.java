package Commands;

public class CurtainDown implements ICommand {

    private Curtain curtain;

    public CurtainDown(Curtain curtain) {
        this.curtain = curtain;
    }

    public void execute() {
        curtain.down();
    }
}
