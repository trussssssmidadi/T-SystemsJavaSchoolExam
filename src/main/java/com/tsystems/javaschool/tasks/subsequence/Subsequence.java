package main.java.com.tsystems.javaschool.tasks.subsequence;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsequence {
    @SuppressWarnings("rawtypes")
    public boolean find(List x, List y) {
        if (x == null || y == null) {
            throw new IllegalArgumentException();
        }

        for(int i = 0; i < y.size(); i++) {
            if (!y.contains(y.get(i)))
                return false;
        }
        return true;
    }
}