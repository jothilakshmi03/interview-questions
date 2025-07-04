package interviewQuestions;

import java.util.Stack;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        int num=00001234;
        int arr[]=intToDigitArray(num);
//        System.out.println(checkLeadingZeros(num));
        for (int digit : arr) {
            System.out.print(digit + " ");
        }
    }
    public static int[] intToDigitArray(int num) {
        String str = String.valueOf(num);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        return arr;
    }

}
