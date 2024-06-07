class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
          Collections.sort(dictionary, (a, b) -> a.length() - b.length());

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Iterate over each word in the sentence
        for (int i = 0; i < words.length; i++) {
            for (String root : dictionary) {
                if (words[i].startsWith(root)) {
                    words[i] = root;
                    break;  // Stop checking other roots once a replacement is made
                }
            }
        }

        // Join the words back into a sentence
        return String.join(" ", words);
    }
}