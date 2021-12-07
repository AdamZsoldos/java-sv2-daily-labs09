package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> getShortestWords(List<String> words) {
        List<String> result = new ArrayList<>();
        int minLength = Integer.MAX_VALUE;
        for (String word : words) {
            if (word.length() < minLength) {
                minLength = word.length();
                result.clear();
            }
            if (word.length() == minLength) {
                result.add(word);
            }
        }
        return result;
    }
}
