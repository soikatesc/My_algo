package matchandgeometry;

public class Pow {
    public double myPow(double x, int n) {
        double result = helper(x, Math.abs(n));
        return n > 0 ? result : (1/result);
    }

    double helper(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;

        double res = helper(x, n / 2);
        res = res * res;

        return n % 2 == 0 ? res : x * res;
    }

    public static void main(String[] args) {
        Pow pow = new Pow();
        System.out.println(pow.myPow(2.00000, 10));
    }
}


//        double result = 1;
//
//        int absN = Math.abs(n);
//        while (absN != 0) {
//            result *= x;
//            absN--;
//        }
//
//        return n < 0 ? (1/result) : result;