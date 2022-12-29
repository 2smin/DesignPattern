package _2_structural_pattern.ProxyPattern.Sample2;

public class SimpleResponseProvider implements ResponseProvider{

    @Override
    public void getResponse() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("response from provider");
    }
}
