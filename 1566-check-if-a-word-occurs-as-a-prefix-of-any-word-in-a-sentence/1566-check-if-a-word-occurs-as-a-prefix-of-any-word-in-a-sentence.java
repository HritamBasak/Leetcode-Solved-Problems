class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int len = searchWord.length();
        int pos = 0;
        int c = 0; // Word index (0-based)
        String sub = "";

        for (int i = 0; i <= sentence.length(); i++) {
            // Process the end of a word (space or end of sentence)
            if (i == sentence.length() || sentence.charAt(i) == ' ') {
                c++; // Increment word index
                sub = sentence.substring(pos, i); // Extract the word

                System.out.println(sub); // Debugging: Print the word

                // Check if the prefix matches
                if (sub.length() >= len && sub.substring(0, len).equals(searchWord)) {
                    return c; // Return 1-based index of the matching word
                }

                pos = i + 1; // Update start position for the next word
            }
        }

        return -1; // No matching prefix found
    }
}
