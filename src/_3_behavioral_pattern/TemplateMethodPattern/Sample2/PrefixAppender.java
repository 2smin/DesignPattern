package _3_behavioral_pattern.TemplateMethodPattern.Sample2;

public class PrefixAppender implements StringAppender{

    @Override
    public String algorithm(String input) {
        input = "@@@" + input;
        return input;
    }
}
