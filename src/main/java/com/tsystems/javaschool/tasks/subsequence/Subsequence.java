package main.java.com.tsystems.javaschool.tasks.subsequence;


import java.util.List;

public class Subsequence {
    @SuppressWarnings("rawtypes")
    public boolean find(List x, List y) {
        if (x.contains(y)) {
            return true;
        } else {
            return false;
        }
    }
}