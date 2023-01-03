package _2_structural_pattern.AdapterPattern.Sample2.Adaptee;

public class WebSocketReceiver {

    public void receiveWebSocketFrame(String message){

        System.out.println("websocket received: " + message);
    }
}
