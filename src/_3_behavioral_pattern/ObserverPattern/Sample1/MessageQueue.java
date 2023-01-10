package _3_behavioral_pattern.ObserverPattern.Sample1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageQueue {

    private Map<String, List<User>> subMap = new HashMap<>();

    public void registerSubscribe(String subject, User user){
        if(subMap.containsKey(subject)){
            subMap.get(subject).add(user);
        }else{
            List<User> userList = new ArrayList<>();
            userList.add(user);
            subMap.put(subject,userList);
        }
    }

    public void unRegisterSubscribe(String subject, User user){
        if(subMap.containsKey(subject)){
            subMap.get(subject).remove(user);
        }else{
            System.out.println("User not found");
        }
    }

    public void sendMessage(String subject, String message){
        if(subMap.containsKey(subject)){
            subMap.get(subject).stream().forEach(u -> u.subscribe(subject, message));
        }
    }
}
