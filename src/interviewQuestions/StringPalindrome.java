package interviewQuestions;

public class StringPalindrome {
    public static void main(String[] args) {
        String str="zyzyz";
        System.out.println(stringPalindrome(str));
    }
    public static boolean stringPalindrome(String str){
        StringBuilder palindrome=new StringBuilder();
        int len=str.length()-1;
        for(int i=len;i>=0;i--){
            palindrome.append(str.charAt(i));
        }
        if(palindrome.toString().equals(str)){
              return true;
        }
        return false;
    }
}
