package _3_behavioral_pattern.StatusPattern.Sample1;

public class Client {

    /*
    status pattern
    상태에 따라 method를 달리 둔다
     */
    public static void main(String[] args) {

        RunTask runTask = new RunTask();
        TaskObject task1 = new TaskObject();
        task1.setAuthenticated(true);
        task1.setFlag(false);


        runTask.setTaskObject(task1);
        runTask.execute();

        runTask.getTaskObject().printState();

    }
}
