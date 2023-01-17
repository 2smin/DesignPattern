package _3_behavioral_pattern.TemplateMethodPattern.Sample2;

public class Client {

    /*
    template callback pattern

     */
    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder(new PrefixAppender());

        stringBuilder.execute("hello world");

        StringBuilder stringBuilder1 = new StringBuilder(new StringAppender() {
            @Override
            public String algorithm(String input) {
                input = "####" + input + "####";
                return input;
            }
        });

        stringBuilder1.execute("design pattern");
    }
}
