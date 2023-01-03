package _2_structural_pattern.AdapterPattern.Sample2;

import _2_structural_pattern.AdapterPattern.Sample2.Adapter.HttpReceiver;

public class ProtocolHandler {

    HttpReceiver httpReceiver;

    public ProtocolHandler(HttpReceiver httpReceiver) {
        this.httpReceiver = httpReceiver;
    }

    public void messageHandle(String message){
        this.httpReceiver.receiveMessage(message);
    }
}
