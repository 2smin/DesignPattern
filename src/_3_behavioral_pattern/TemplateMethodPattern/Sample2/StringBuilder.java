package _3_behavioral_pattern.TemplateMethodPattern.Sample2;

public class StringBuilder {

    StringAppender stringAppender;

    public StringBuilder(StringAppender stringAppender) {
        this.stringAppender = stringAppender;
    }

    public void execute(String input){
        String output = this.stringAppender.algorithm(input);

        output = "[[[" + output + "]]]";

        System.out.println(output);
    }
}
