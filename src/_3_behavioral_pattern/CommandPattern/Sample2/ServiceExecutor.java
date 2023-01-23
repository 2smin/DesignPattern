package _3_behavioral_pattern.CommandPattern.Sample2;

public class ServiceExecutor implements Executor{

    private ServiceTaskObject serviceTaskObject;

    public ServiceExecutor(ServiceTaskObject serviceTaskObject) {
        this.serviceTaskObject = serviceTaskObject;
    }

    @Override
    public void execute() {
        this.serviceTaskObject.runService();
    }
}
