package _3_behavioral_pattern.StatusPattern.Sample1.Status;

import _3_behavioral_pattern.StatusPattern.Sample1.TaskObject;

public class Error extends AbstractState{

    public Error(TaskObject taskObject) {
        super(taskObject);
    }

    @Override
    public boolean execute() {
        System.out.println("error occured");
        System.out.println("retry this taskobject");
        return false;
    }
}
