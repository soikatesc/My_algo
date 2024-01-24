package matchandgeometry;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int[] output = new int[num1.length() + num2.length()];

        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();

        for (int i1 = 0; i1 < num1.length(); i1++) {
            for (int i2 = 0; i2 < num2.length(); i2++) {
                int digit = Integer.valueOf(String.valueOf(num1.charAt(i1)))
                        * Integer.valueOf(String.valueOf(num2.charAt(i2)));

                output[i1 + i2] += digit;
                output[i1 + i2 + 1] += output[i1+i2] / 10;
                output[i1 + i2] = output[i1+i2] % 10;
            }
        }

        reverseArrayInPlace(output);

        // get proper index
        int startIdx = 0;
        while (startIdx < output.length) {
            if (output[startIdx] != 0) {
                break;
            }
            startIdx++;
        }

        StringBuilder buildResponse = new StringBuilder();
        for (int i = startIdx; i < output.length; i++) {
            buildResponse.append(output[i]);
        }

        return buildResponse.toString();
    }

    private void reverseArrayInPlace(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        MultiplyStrings obj = new MultiplyStrings();
        // obj.multiply("10", "10");
        obj.multiply("123", "456");
    }
}
