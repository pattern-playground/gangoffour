package behavioral.command.homeautomation.implementation;

import behavioral.command.homeautomation.Command;

public class RemoteControl{

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}