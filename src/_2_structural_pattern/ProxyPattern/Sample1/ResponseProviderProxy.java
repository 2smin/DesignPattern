package _2_structural_pattern.ProxyPattern.Sample1;

public class ResponseProviderProxy extends DefaultResponseProvider{

    private boolean logger = true;
    private boolean timeChecker = true;

    public boolean isLogger() {
        return logger;
    }

    public void setLogger(boolean logger) {
        this.logger = logger;
    }

    public boolean isTimeChecker() {
        return timeChecker;
    }

    public void setTimeChecker(boolean timeChecker) {
        this.timeChecker = timeChecker;
    }

    @Override
    public String getResponse(String request) {
        String response = null;

        if(timeChecker){
            long before = System.currentTimeMillis();
            response = super.getResponse(request);
            long time = System.currentTimeMillis() - before;
            response = response + "\n" + time + " millisecond taken";
        }else{
            response = super.getResponse(request);
        }

        if(logger){
            response = response  + "\n" + " proxy received reques from client";
        }


        return response;
    }


}
