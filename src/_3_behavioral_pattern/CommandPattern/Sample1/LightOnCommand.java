package _3_behavioral_pattern.CommandPattern.Sample1;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.button = !light.button;
        if(light.button){
            light.lightOn();
        }else{
            light.lightOff();
        }
    }


}
