package Controller;

import Commands.*;

import java.rmi.Remote;

public class RemoteLoader {

    public RemoteLoader(){
        RemoteControl rc = createController();
        Gui gui = new Gui(rc);
    }

    public RemoteControl createController(){
        Light light = new Light();
        LightUp lu = new LightUp(light);
        LightDown ld = new LightDown(light);

        Curtain curtain = new Curtain();
        CurtainUp cu = new CurtainUp(curtain);
        CurtainDown cd = new CurtainDown(curtain);

        Temperature temp = new Temperature();
        TemperatureUp tu = new TemperatureUp(temp);
        TemperatureDown td = new TemperatureDown(temp);


        RemoteControl rc = new RemoteControl();

        rc.setCommand(1, lu ,ld);
        rc.setCommand(2, cu, cd);
        rc.setCommand(3, tu, td);

        return rc;
    }

    public static void main(String[] args){
        RemoteLoader rl = new RemoteLoader();
    }

}
