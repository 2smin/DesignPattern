package _3_behavioral_pattern.TemplateMethodPattern.Sample1;

import java.io.BufferedReader;

public class Multiple extends Calculator{

    public Multiple(String path) {
        super(path);
    }

    @Override
    public int executeAlgorithm(int result, int number) {
        return result == 0 ? number : result * number;
    }
}
