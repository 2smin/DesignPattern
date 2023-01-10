package _3_behavioral_pattern.ObserverPattern.Sample1;

public class User implements Subscribe{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(String subject, String message) {
        System.out.println(this.name + " user received message [" + subject+"] [message: " + message +"]");
    }
}
