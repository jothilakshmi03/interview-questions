package interviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String str="hello";
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str){
        int len=str.length()-1;
        StringBuilder sb=new StringBuilder();
        for(int i=len;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
