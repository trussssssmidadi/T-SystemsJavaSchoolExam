package main.java.com.tsystems.javaschool.tasks.calculator;

import java.util.List;

public class Calculator {
    public String evaluate(String statement) {
        List<String> tokens = List.of(statement.split("(?<=[-+*/])|(?=[-+*/])"));
        String operators = "+-/*";
        return "";
    }
}
