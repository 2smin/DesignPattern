package _3_behavioral_pattern.chainOfResPattern.Sample1;

public abstract class RequestHandler {

    private RequestHandler nextHandler;

    public RequestHandler getNextHandler(){
        return nextHandler;
    }

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public Request doNext(Request request){
        if(nextHandler!=null){
            return nextHandler.doNext(request);
        }else{
            return request;
        }
    }
}
