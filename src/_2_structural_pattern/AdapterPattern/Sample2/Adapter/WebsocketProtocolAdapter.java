package _2_structural_pattern.AdapterPattern.Sample2.Adapter;

import _2_structural_pattern.AdapterPattern.Sample2.Adaptee.WebSocketReceiver;

public class WebsocketProtocolAdapter implements HttpReceiver{

    private WebSocketReceiver webSocketReceiver;

    public WebsocketProtocolAdapter(WebSocketReceiver webSocketReceiver) {
        this.webSocketReceiver = webSocketReceiver;
    }

    @Override
    public void receiveMessage(String message) {
        webSocketReceiver.receiveWebSocketFrame(message);
    }
}
