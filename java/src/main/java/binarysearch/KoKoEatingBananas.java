package binarysearch;

import java.util.Arrays;

public class KoKoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 0;
        int right = Arrays.stream(piles).max().getAsInt();


        while (left < right) {
            int mid = (left + right) / 2; // k

            // for loop for piles
            int hourSpent = 0;
            for (int pile : piles) {
                hourSpent += Math.ceil((double) pile / mid);
            }

            if (hourSpent <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }

    public static void main(String[] args) {
        int[] piles = { 30,11,23,4,20 };
        int h = 5;
        minEatingSpeed(piles, h);
    }
}
