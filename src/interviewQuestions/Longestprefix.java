package interviewQuestions;

import java.util.ArrayList;

public class Longestprefix {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("flower");
        words.add("floral");
        words.add("flew");

        System.out.println(longestPrefix(words));
    }

    public static String longestPrefix(ArrayList<String> words) {
        if (words == null || words.isEmpty()) {
            return "";
        }

        String prefix = words.get(0);
        for (int i = 1; i < words.size(); i++) {
            while (words.get(i).indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
