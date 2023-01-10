package _3_behavioral_pattern.ObserverPattern.Sample1;

public class Client {

    /*
    observer pattern
    pub sub 구조 구현
    subscriber는 publisher 또는 publish 된곳에 직접 polling 해 줄 필요 없이 알아서 subject에 대한 message를 받을 수 있다.
    subject, observer, concrete observer

     */
    public static void main(String[] args) {

        MessageQueue msgQueue = new MessageQueue();
        User user = new User("smlee");
        User user1 = new User("abc");
        User user2 = new User("planner");


        msgQueue.registerSubscribe("DesignPattern", user);
        msgQueue.registerSubscribe("DesignPattern", user1);
        msgQueue.registerSubscribe("DesignPattern", user2);

        msgQueue.registerSubscribe("EffectiveJava", user1);
        msgQueue.registerSubscribe("EffectiveJava", user2);

        msgQueue.sendMessage("DesignPattern", "study hard!");


        msgQueue.sendMessage("EffectiveJava", "do everyDay");
    }
}
