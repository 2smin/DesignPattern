package _3_behavioral_pattern.StrategyPattern.Sample1;

public class InternetExecutor {

    private Browser browser;

    public InternetExecutor(Browser browser) {
        this.browser = browser;
    }

    public void runBrowser(){
        this.browser.execute();
    }
}
