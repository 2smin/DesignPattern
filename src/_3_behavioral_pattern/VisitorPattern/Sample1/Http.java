package _3_behavioral_pattern.VisitorPattern.Sample1;

public class Http implements Protocol{

    @Override
    public void sendPacket(Safari safari) {
        System.out.println(safari.syncWithMac() + " http request");
    }

    @Override
    public void sendPacket(Chrome chrome) {
        System.out.println(chrome.useExtensions() + " response sealing");
    }

    @Override
    public void sendPacket(Explorer explorer) {
        System.out.println(explorer.sendStatus() + " :(");
    }
}
