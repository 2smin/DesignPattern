package _3_behavioral_pattern.TemplateMethodPattern.Sample1;

import java.io.BufferedReader;

public class Substract extends Calculator{

    public Substract(String path) {
        super(path);
    }

    @Override
    public int executeAlgorithm(int result, int number) {
        return result - number;
    }
}
