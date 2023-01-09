package _3_behavioral_pattern.MementorPattern.Sample1;

public class BatchSave {
    private final String currentStep;
    private final String startFrom;

    public BatchSave(String currentStep, String startFrom) {
        this.currentStep = currentStep;
        this.startFrom = startFrom;
    }

    public String getCurrentStep() {
        return currentStep;
    }

    public String getStartFrom() {
        return startFrom;
    }
}
