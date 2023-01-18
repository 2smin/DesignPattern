package _3_behavioral_pattern.VisitorPattern.Sample1;

public class Chrome implements Browser{

    public String useExtensions(){
        return "vpn extension ";
    }

    @Override
    public void on(Protocol protocol) {
        protocol.sendPacket(this);
    }
}
