package _3_behavioral_pattern.MementorPattern.Sample1;

public class BatchTask {

    private String currentStep;
    private String startFrom;

    public String getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(String currentStep) {
        this.currentStep = currentStep;
    }

    public String getStartFrom() {
        return startFrom;
    }

    public void setStartFrom(String startFrom) {
        this.startFrom = startFrom;
    }

    public BatchSave save(){
        return new BatchSave(this.currentStep, this.startFrom);
    }

    public void restore(BatchSave batchSave){
        this.currentStep = batchSave.getCurrentStep();
        this.startFrom = batchSave.getStartFrom();
    }
}
