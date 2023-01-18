package _3_behavioral_pattern.VisitorPattern.Sample1;

public class Safari implements Browser{

    public String syncWithMac(){
        return "MacSync";
    }

    @Override
    public void on(Protocol protocol) {
        protocol.sendPacket(this);
    }
}
