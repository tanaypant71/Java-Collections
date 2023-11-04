public class MaxWordsInSentence {
    public static int maxWordsInSentence(String[] sentences) {
        int maxWords = 0;  // Initialize a variable to store the maximum number of words

        for (String sentence : sentences) {
            // Split the sentence into words using space as a delimiter
            String[] words = sentence.split(" ");

            // Check the number of words in the current sentence and update maxWords if needed
            if (words.length > maxWords) {
                maxWords = words.length;
            }
        }

        return maxWords;
    }

    public static void main(String[] args) {
        // Example 1
        String[] sentences1 = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int output1 = maxWordsInSentence(sentences1);
        System.out.println("Example 1: " + output1);  // Output: 6

        // Example 2
        String[] sentences2 = {"please wait", "continue to fight", "continue to win"};
        int output2 = maxWordsInSentence(sentences2);
        System.out.println("Example 2: " + output2);  // Output: 3
    }
}
