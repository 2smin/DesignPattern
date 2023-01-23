package _3_behavioral_pattern.CommandPattern.Sample2;

public class BatchExecutor implements Executor{

    private BatchTaskObject batchTaskObject;

    public BatchExecutor(BatchTaskObject batchTaskObject) {
        this.batchTaskObject = batchTaskObject;
    }

    @Override
    public void execute() {
        batchTaskObject.runBatch();
    }
}
