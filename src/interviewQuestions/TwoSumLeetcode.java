package interviewQuestions;

public class TwoSumLeetcode {
    public static void main(String[] args) {
        int[] array = {1, 8, 4, 5, 6, 7};
        int target = 9;
        System.out.println(twosum(array, target));

    }

    public static int twosum(int[] array, int target) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (array[i] + array[j] == target) {
                    return i;
                }
            }
        }
        return len;
    }
}
