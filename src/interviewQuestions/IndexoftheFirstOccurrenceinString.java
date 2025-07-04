package interviewQuestions;

public class IndexoftheFirstOccurrenceinString {
    public static void main(String[] args) {
        String haystack = "aaa";
        String needle = "aaaa";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
       StringBuilder sh= new StringBuilder();
       int len=needle.length();
       int len1=haystack.length();
       if(len>len1){
           return -1;
       }
       for(int i=0;i<len;i++){
           if(haystack.charAt(i)==needle.charAt(i)){
               sh.append(i);
           }
           if(sh.equals(needle)){
               break;
           }
       }
        return haystack.indexOf(needle);
    }
}
