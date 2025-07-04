package interviewQuestions;

public class VowelCountCheck {
    public static void main(String[] args) {
        String str="my name is jyothilakshmi aaa";
        System.out.println(vowelCountcheck(str));
    }
    public static int vowelCountcheck(String str){
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
}

