package _3_behavioral_pattern.chainOfResPattern.Sample1;

public class Client {

    public static void main(String[] args) {

        RequestHandler chain = new AddSuffixHandler(new TrimRequestHandler(null));
        Request response = chain.doNext(sendRequest());

        System.out.println("res: " + response.header);
    }

    public static Request sendRequest(){
        Request request = new Request();
        request.header = "oioi/github.com/planner26/";
        return request;
    }
}
