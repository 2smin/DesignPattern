package _3_behavioral_pattern.chainOfResPattern.Sample1;

public class AddSuffixHandler extends RequestHandler{

    public AddSuffixHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public Request doNext(Request request) {
        System.out.println("suffix handler execute...");
        request.header = request.header + "_AUTHORIZED";
        return super.doNext(request);
    }
}
