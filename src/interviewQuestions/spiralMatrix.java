package interviewQuestions;


public class spiralMatrix {
    public static void main(String[] args) {
        int array[][]=new int[3][3];
        System.out.println(Spiralmatrix(array));
    }
    public static int Spiralmatrix(int array[][]) {
        int j = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            for (j = 1; j <= i; j++) {
                return j;
            }
        }
        return array[i][j];
    }
}
