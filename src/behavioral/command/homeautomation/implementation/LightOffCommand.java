package behavioral.command.homeautomation.implementation;


import behavioral.command.homeautomation.Command;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.switchOff();
    }
}
