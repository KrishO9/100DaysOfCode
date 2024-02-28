import java.util.List;
import java.util.Arrays;
import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
class Solution {
         public List<String> topKFrequent(String[] words, int k) {
        int count = 1;
        Map<String, Integer> wordCount = new HashMap<>();
        ArrayList<String>[] arr = new ArrayList[words.length + 1];
        List<String> res = new ArrayList<>();

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        };
        Arrays.sort(words, comp);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals(words[i + 1])) {
                count++;
                if (i == words.length - 2) {
                    wordCount.put(words[i + 1], count);
                }
            } else {
                wordCount.put(words[i], count);
                count = 1;
                if (i == words.length - 2) {
                    wordCount.put(words[i + 1], 1);
                }
            }
        }
        System.out.println(wordCount);

        wordCount.forEach((key, value) -> {
            if (arr[value] == null) {
                arr[value] = new ArrayList<>();
            }
            arr[value].add(key);
            Collections.sort(arr[value]);
        });

        

        for (int i = arr.length - 1; i >= 0 && res.size() < k; i--) {
            if (arr[i] != null) {
                res.addAll(arr[i]);
            }
        }

        return res.subList(0, k);
    }
}