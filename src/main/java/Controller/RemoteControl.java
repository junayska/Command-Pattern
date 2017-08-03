package Controller;

import Commands.*;

import Commands.ICommand;
import com.sun.org.apache.bcel.internal.generic.ICONST;

import java.util.HashMap;

public class RemoteControl {

    RemoteControl(){
        upCommands = new ICommand[5];
        downCommands = new ICommand[5];

        ICommand noCommand = new noCommand();
        for(int i=0; i<5; i++){
            this.upCommands[i] = noCommand;
            this.downCommands[i] = noCommand;
        }
    }

    private ICommand[] upCommands;
    private ICommand[] downCommands;

    protected void setCommand(int button, ICommand upCommand, ICommand downCommand){
        this.upCommands[button] = upCommand;
        this.downCommands[button] = downCommand;
    }

    protected void pushUpButton(int button){
        upCommands[button].execute();
    }

    protected void pushDownButton(int button){
        downCommands[button].execute();
    }

}
