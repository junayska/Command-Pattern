package Commands;

public class Light {

    private boolean lightOn = false;

    protected void on(){
        this.lightOn = true;
        System.out.println("Light is on");
    }

    protected void off(){
        this.lightOn = false;
        System.out.println("Light is off");
    }
}
