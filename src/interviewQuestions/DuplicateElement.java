package interviewQuestions;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] array={6,2,2,3,4,5,5};
        System.out.println(duplicateEle(array));
    }
    public static int duplicateEle(int[] array){
        int len=array.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(array[i]==array[j]){
                    return array[i];
                }
            }
        }
        return len;
    }
}
