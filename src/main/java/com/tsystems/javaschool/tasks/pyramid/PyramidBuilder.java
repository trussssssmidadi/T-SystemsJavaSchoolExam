package main.java.com.tsystems.javaschool.tasks.pyramid;

import java.util.*;

public class PyramidBuilder {
    public int[][] buildPyramid(List<Integer> inputNumbers) throws CannotBuildPyramidException {
        int size = inputNumbers.size();
        int row = numberOfRows(size);
        int col = 2 * row - 1;
        int[][] result = new int[row][col];

        Collections.sort(inputNumbers);

        for (int i = 0; i < row; i++) {
            int index = 0;
            for (int j = row - i - 1; j < row + i; j += 2) {
                result[i][j] = inputNumbers.get(index++);
            }
        }
        return result;
    }
    private static int numberOfRows(int size) {
        double result = (Math.sqrt(1 + 8 * size) - 1) / 2;

        if (result - (int) result != 0.0) {
            throw new CannotBuildPyramidException();
        }
        return (int) result;
    }
}
