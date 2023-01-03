package _2_structural_pattern.AdapterPattern.Sample2.Adapter;

public class DefaultHttpReceiver implements HttpReceiver {

    @Override
    public void receiveMessage(String message) {
        System.out.println("message received: " + message);
    }
}
