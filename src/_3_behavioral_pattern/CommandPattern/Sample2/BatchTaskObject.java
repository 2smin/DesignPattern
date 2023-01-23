package _3_behavioral_pattern.CommandPattern.Sample2;

public class BatchTaskObject {

    private String batchName;

    public BatchTaskObject(String batchName) {
        this.batchName = batchName;
    }

    public void runBatch(){

        System.out.println("run batch : " + this.batchName);
    }
}
