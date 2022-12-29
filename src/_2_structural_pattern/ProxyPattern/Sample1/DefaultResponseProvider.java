package _2_structural_pattern.ProxyPattern.Sample1;

public class DefaultResponseProvider {

    public String getResponse(String request){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String response = "received " + request + "from client.";

        return response;
    }
}
