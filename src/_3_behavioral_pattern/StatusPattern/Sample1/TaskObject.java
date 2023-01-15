package _3_behavioral_pattern.StatusPattern.Sample1;

import _3_behavioral_pattern.StatusPattern.Sample1.Status.Ready;
import _3_behavioral_pattern.StatusPattern.Sample1.Status.State;

public class TaskObject {

    private State state = new Ready(this);

    private boolean isAuthenticated;
    private boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        isAuthenticated = authenticated;
    }

    public boolean runTaskObject(){

        System.out.println("do taskObject");
        return this.state.execute();
    }


    public void printState(){
        System.out.println(this.state.getClass().getSimpleName());
    }
}
