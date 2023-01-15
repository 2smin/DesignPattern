package _3_behavioral_pattern.StatusPattern.Sample1.Status;

import _3_behavioral_pattern.StatusPattern.Sample1.TaskObject;

public class Ongoing extends AbstractState{

    public Ongoing(TaskObject taskObject) {
        super(taskObject);
    }

    @Override
    public boolean execute() {
        System.out.println("state is ongoing, ");

        if(getTaskObject().isFlag()){
            getTaskObject().setState(new Terminate(this.getTaskObject()));
            return true;
        }
        getTaskObject().setState(new Error(this.getTaskObject()));
        return false;
    }
}
