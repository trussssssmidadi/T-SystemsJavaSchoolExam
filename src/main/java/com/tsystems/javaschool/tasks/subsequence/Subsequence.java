package main.java.com.tsystems.javaschool.tasks.subsequence;

import java.util.List;

public class Subsequence {
    @SuppressWarnings("rawtypes")
    public boolean find(List x, List y) {
        int countX = 0;
        if (x == null || y == null) {
            throw new IllegalArgumentException();
        } else if (x.isEmpty() || y.isEmpty()) {
            return true;
        }
        for (Object o : y) {
            if (o.equals(x.get(countX)) && ++countX == x.size()) {
                return true;
            }
        }
        return false;
    }
}