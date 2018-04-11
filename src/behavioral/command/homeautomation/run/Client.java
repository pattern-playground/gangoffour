package behavioral.command.homeautomation.run;

import behavioral.command.homeautomation.Command;
import behavioral.command.homeautomation.implementation.RemoteControl;
import behavioral.command.homeautomation.implementation.Light;
import behavioral.command.homeautomation.implementation.LightOnCommand;
import behavioral.command.homeautomation.implementation.LightOffCommand;

public class Client {

    public static void main(String[] args)    {

        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        // Switch on
        control.setCommand(lightsOn);
        control.pressButton();

        // Switch off
        control.setCommand(lightsOff);
        control.pressButton();
    }
}

// *** Output ***
// Light switched on
// Light switched off