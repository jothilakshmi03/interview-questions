package interviewQuestions;

public class StringSorting {
    public static void main(String[] args) {
        String str="software";
        char[] str1=str.toCharArray();
        char[] sorted=stringSort(str1);
        System.out.println(new String(sorted));
    }
    public static char[] stringSort(char[] str1){
        int len=str1.length;
        for (int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++) {
                if (str1[i] > str1[j]) {
                    char temp = str1[i];
                    str1[i] = str1[j];
                    str1[j] = temp;
                }
            }
        }
        return str1;
    }
}
