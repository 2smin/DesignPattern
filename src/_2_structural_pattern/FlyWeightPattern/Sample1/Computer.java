package _2_structural_pattern.FlyWeightPattern.Sample1;

public class Computer {

    private ImmutableParts immutableParts;

    private String cpu;
    private String graphicCard;
    private String ssd;

    public Computer(ImmutableParts immutableParts, String cpu, String graphicCard, String ssd) {
        this.immutableParts = immutableParts;
        this.cpu = cpu;
        this.graphicCard = graphicCard;
        this.ssd = ssd;
    }

    public ImmutableParts getImmutableParts() {
        return immutableParts;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getSsd() {
        return ssd;
    }
}
