package main.java.com.tsystems.javaschool.tasks.pyramid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PyramidBuilder {
    public int[][] buildPyramid(List<Integer> inputNumbers) {
        if (inputNumbers.contains(null)) {
            throw new CannotBuildPyramidException();
        }
        Collections.sort(inputNumbers);

        return new int[0][0];
    }
    private static int numberOfRows(int size) {
        double result = (Math.sqrt(1 + 8 * size) - 1) / 2;

        if (result == Math.ceil(result)) {
            return (int) result;

        } else {
            throw new CannotBuildPyramidException();
        }
    }

    public static void main(String[] args) {
        PyramidBuilder p = new PyramidBuilder();
        List<Integer> input = List.of(1,9,3,6,4,2);
        p.buildPyramid(input);
    }
}
