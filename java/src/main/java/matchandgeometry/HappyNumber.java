package matchandgeometry;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (!set.contains(n)) {
            set.add(n);
            n = sumOfSquares(n);

            if (n == 1) return  true;
        }

        return false;
    }

    public int sumOfSquares(int num) {
        int newNum = 0;

        while (num != 0) {
            int rem = num % 10;
            newNum += rem * rem;
            num = num / 10;
        }

        return newNum;
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        happyNumber.isHappy(19);
    }
}
