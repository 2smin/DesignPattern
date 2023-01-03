package _2_structural_pattern.AdapterPattern.Sample2;

import _2_structural_pattern.AdapterPattern.Sample2.Adaptee.WebSocketReceiver;
import _2_structural_pattern.AdapterPattern.Sample2.Adapter.DefaultHttpReceiver;
import _2_structural_pattern.AdapterPattern.Sample2.Adapter.HttpReceiver;
import _2_structural_pattern.AdapterPattern.Sample2.Adapter.WebsocketProtocolAdapter;

public class Client {

    /*
    adapter pattern
    기존 코드를 클라이언트가 사용하는 인터페이스의 구현체로 변경
    클라이언트가 사용하는 인터페이스를 따르지 않는 기존 코드를 재사용할수 있게함
     */
    public static void main(String[] args) {


        ProtocolHandler handler = new ProtocolHandler(new DefaultHttpReceiver());
        handler.messageHandle("hello world");
        /*
        websocketreceiver는 httpReceiver를 지원하는 protocolHandler 규격과 맞지 않아서 사용 불가
        websocketreceiver를 protocolHandler 규격에 맞게 변환해주는 adapter를 만든다
        websocketProtocolAdapter가 websocketReceiver와 protocolHandler를 연결해준다
         */

//        ProtocolHandler handler1 = new ProtocolHandler(new WebSocketReceiver()); 불가

        ProtocolHandler handler2 = new ProtocolHandler(new WebsocketProtocolAdapter(new WebSocketReceiver()));
        handler2.messageHandle("hello world");
    }
}
