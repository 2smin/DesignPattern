package _3_behavioral_pattern.chainOfResPattern.Sample1;

public class TrimRequestHandler extends RequestHandler  {

    public TrimRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public Request doNext(Request request) {
        System.out.println("trimming handler execute");
        if(request.header.contains("http://")){
            request.header = request.header.split("http://")[1];
            return super.doNext(request);
        }else{
            System.out.println("cannot trim http request.. terminate chain");
            return request;
        }
    }
}
