package _3_behavioral_pattern.CommandPattern.Sample2;

public class Client {

    public static void main(String[] args) {

        Switch swh = new Switch();

        swh.setExecutor(new BatchExecutor(new BatchTaskObject("testBatch")));

        swh.setExecutor(new ServiceExecutor(new ServiceTaskObject("testService")));

        swh.pressSwitch();
    }

    public static class Switch{

        Executor executor;

        void setExecutor(Executor executor){
            this.executor = executor;
        }

        void pressSwitch(){
            this.executor.execute();
        }
    }
}
