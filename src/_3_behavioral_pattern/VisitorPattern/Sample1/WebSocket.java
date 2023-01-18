package _3_behavioral_pattern.VisitorPattern.Sample1;

public class WebSocket implements Protocol{
    @Override
    public void sendPacket(Explorer explorer) {
        System.out.println(explorer.sendStatus() + "... not supported");
    }

    @Override
    public void sendPacket(Safari safari) {
        System.out.println(safari.syncWithMac() + " websocket");
    }

    @Override
    public void sendPacket(Chrome chrome) {
        System.out.println(chrome.useExtensions() + " websocket");
    }
}
