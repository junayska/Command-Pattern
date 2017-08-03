package Commands;

public class Curtain {

    private boolean curtainIsUp = false;

    protected void up() {
        this.curtainIsUp = true;
        System.out.println("Curtain up");
    }

    protected void down(){
        this.curtainIsUp = false;
        System.out.println("Curtain down");
    }
}
