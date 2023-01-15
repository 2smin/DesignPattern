package _3_behavioral_pattern.StatusPattern.Sample1.Status;

import _3_behavioral_pattern.StatusPattern.Sample1.TaskObject;

public class Ready extends AbstractState{

    public Ready(TaskObject taskObject) {
        super(taskObject);
    }

    public boolean execute(){
        if(getTaskObject().isAuthenticated()){
            this.getTaskObject().setState(new Ongoing(this.getTaskObject()));
            return true;
        }
        System.out.println("not authenticated");
        return false;
    }
}
