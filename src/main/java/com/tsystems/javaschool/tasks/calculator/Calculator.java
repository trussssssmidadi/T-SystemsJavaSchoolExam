package main.java.com.tsystems.javaschool.tasks.calculator;

import java.util.List;

public class Calculator {
    public String evaluate(String statement) {
        List<String> tokens = List.of(statement.split("(?<=[-(+*/])|(?=[-+*/)])"));
        String operators = "+-/*";

        return tokens.toString();
    }


    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.evaluate("(1+38)*4-5")); // Result: 151
        System.out.println(c.evaluate("(1+38)*4-5+(2-1)")); // Result: 152
        System.out.println(c.evaluate("7*6/2+8")); // Result: 29
        System.out.println(c.evaluate("-12)1//(")); // Result: null
    }
}
