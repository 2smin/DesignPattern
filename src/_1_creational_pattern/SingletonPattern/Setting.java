package _1_creational_pattern.SingletonPattern;

public class Setting {

    private Setting(){}

    private static Setting setting;

    //multi thread not safe
    public static Setting getInstance(){

        if(setting == null){
            setting = new Setting();
        }

        return setting;
    }
}
