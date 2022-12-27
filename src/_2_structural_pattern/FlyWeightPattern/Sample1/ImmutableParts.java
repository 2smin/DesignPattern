package _2_structural_pattern.FlyWeightPattern.Sample1;

public final class ImmutableParts {

    private final String power;
    private final String mainBoard;

    public ImmutableParts(String power, String mainBoard) {
        this.power = power;
        this.mainBoard = mainBoard;
    }

    public String getPower() {
        return power;
    }

    public String getMainBoard() {
        return mainBoard;
    }
}
