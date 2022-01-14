package main.java.com.tsystems.javaschool.tasks.subsequence;

import java.util.Collections;
import java.util.List;

public class Subsequence {
    @SuppressWarnings("rawtypes")
    public boolean find(List x, List y) {
        if (x.size() <= 0 || y.size() <= 0) {
            throw new IllegalArgumentException();
        }
        return x.equals(y);
    }
}