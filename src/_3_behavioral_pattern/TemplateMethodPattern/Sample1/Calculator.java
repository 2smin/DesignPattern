package _3_behavioral_pattern.TemplateMethodPattern.Sample1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public abstract class Calculator {

    String path;

    public Calculator(String path) {
        this.path = Calculator.class.getResource("").getPath() + path;
    }

    public void calculate() {
        int result = 0;
        String line = null;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(this.path))){
            while((line = bufferedReader.readLine()) != null){
                result = executeAlgorithm(result, Integer.parseInt(line));
            }
        }catch (Exception e ){
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public abstract int executeAlgorithm(int result, int number);
}
