package arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTringle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(0);
            temp.addAll(result.get(result.size() - 1));
            temp.add(0);

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                row.add(temp.get(j) + temp.get(j+1));
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        generate(5);
    }
}
