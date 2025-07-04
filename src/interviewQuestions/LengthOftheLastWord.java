package interviewQuestions;

public class LengthOftheLastWord {
    public static void main(String[] args) {
        String str="fly me to the moon ";
        System.out.println(LenOfTheString(str));
    }
    public static int LenOfTheString(String str){
        int len=str.length()-1;
//        if(len==0){
//            return -1;
//        }
        while (len >= 0 && str.charAt(len) == ' ') {
            len--;
        }
        int count=0;
        for(int i=len;i>=0;i--){
            if(str.charAt(i)==32){
                break;
            }
            if(str.charAt(i)!=32){
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
}
