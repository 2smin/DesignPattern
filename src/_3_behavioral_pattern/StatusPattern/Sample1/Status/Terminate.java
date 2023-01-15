package _3_behavioral_pattern.StatusPattern.Sample1.Status;

import _3_behavioral_pattern.StatusPattern.Sample1.TaskObject;

public class Terminate extends AbstractState{

    public Terminate(TaskObject taskObject) {
        super(taskObject);
    }

    @Override
    public boolean execute() {
        System.out.println("terminated");
        return false;
    }
}
