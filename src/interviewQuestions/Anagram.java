package interviewQuestions;

public class Anagram {
    public static void main(String[] args) {
        String str1="iiearth";
        String str2="heiiart";
        System.out.println(anagraCheck(str1,str2));
    }
    public static boolean anagraCheck(String str1,String str2){
        int len=str1.length();
        int len1=str2.length();
        if(len!=len1){
            return false;
        }
        int count=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len1;j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;
                }
            }
            if(len==count){
                return true;
            }
        }
        return false;
    }
}
