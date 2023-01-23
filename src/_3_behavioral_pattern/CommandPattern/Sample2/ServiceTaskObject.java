package _3_behavioral_pattern.CommandPattern.Sample2;

public class ServiceTaskObject {

    private String serviceName;

    public ServiceTaskObject(String serviceName) {
        this.serviceName = serviceName;
    }

    public void runService(){
        System.out.println("run service : " + this.serviceName);
    }
}
