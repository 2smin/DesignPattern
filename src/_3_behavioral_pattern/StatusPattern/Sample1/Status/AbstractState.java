package _3_behavioral_pattern.StatusPattern.Sample1.Status;

import _3_behavioral_pattern.StatusPattern.Sample1.TaskObject;

public abstract class AbstractState implements State{

    public AbstractState(TaskObject taskObject) {
        this.taskObject = taskObject;
    }

    private TaskObject taskObject;

    public TaskObject getTaskObject() {
        return taskObject;
    }

    public void setTaskObject(TaskObject taskObject) {
        this.taskObject = taskObject;
    }
}
