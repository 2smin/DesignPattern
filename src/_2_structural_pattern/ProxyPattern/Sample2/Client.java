package _2_structural_pattern.ProxyPattern.Sample2;

public class Client {

    public static void main(String[] args) {

        ResponseProvider responseProvider = new ResponseProviderProxy(new SimpleResponseProvider());
        responseProvider.getResponse();
    }
}
