package Commands;

public class Temperature {

    private int celsius = 20;

    protected void down() {
        this.celsius = celsius - 1;
        System.out.println("Temperature is: " + celsius);
    }

    protected void up() {
        this.celsius = celsius + 1;
        System.out.println("Temperature is: " + celsius);
    }
}
