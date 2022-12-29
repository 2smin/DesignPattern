package _2_structural_pattern.ProxyPattern.Sample2;

public class ResponseProviderProxy implements ResponseProvider{

    ResponseProvider responseProvider;

    public ResponseProviderProxy(ResponseProvider responseProvider) {
        this.responseProvider = responseProvider;
    }

    @Override
    public void getResponse() {
        long before = System.currentTimeMillis();
        this.responseProvider.getResponse();
        System.out.println(System.currentTimeMillis() - before);
    }
}
