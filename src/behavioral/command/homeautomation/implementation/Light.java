package behavioral.command.homeautomation.implementation;

public class Light{

    private boolean on;

    public void switchOn(){
        on = true;
        System.out.println("Light switched on");
    }

    public void switchOff(){
        on = false;
        System.out.println("Light switched off");
    }
}
