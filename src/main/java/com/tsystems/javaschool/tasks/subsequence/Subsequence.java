package main.java.com.tsystems.javaschool.tasks.subsequence;

import java.util.List;

public class Subsequence {
    @SuppressWarnings("rawtypes")
    public boolean find(List x, List y) {
        try {
            if ((x == null && y != null) || (x != null && y == null)) {
                return false;

            } else if (x == null || x.isEmpty() && y.isEmpty()) {
                return true;

            } else if (x.size() != y.size()) {
                return false;
            }
            return x.equals(y);

        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}