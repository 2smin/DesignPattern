package _3_behavioral_pattern.StatusPattern.Sample1;

public class RunTask {

    //state = ready ongoing terminate

    private TaskObject taskObject;

    public TaskObject getTaskObject() {
        return taskObject;
    }

    public void setTaskObject(TaskObject taskObject) {
        this.taskObject = taskObject;
    }

    public void execute(){
        while(taskObject.runTaskObject()){
            System.out.println("state change");
        }

        System.out.println("execute done");
    }
}
