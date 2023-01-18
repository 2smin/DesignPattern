package _3_behavioral_pattern.VisitorPattern.Sample1;

public class Explorer implements Browser{

    public String sendStatus(){
        return "good browser to download other browsers";
    }
    @Override
    public void on(Protocol protocol) {
        protocol.sendPacket(this);
    }
}
