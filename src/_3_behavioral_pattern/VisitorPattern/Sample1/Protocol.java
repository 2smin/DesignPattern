package _3_behavioral_pattern.VisitorPattern.Sample1;

public interface Protocol {

    void sendPacket(Safari safari);

    void sendPacket(Chrome chrome);

    void sendPacket(Explorer explorer);
}
