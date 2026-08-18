/*Write a program to print the letters of the word "WORKATTECH" with two letters in one line.

 */
class PrintLetters {
    public static void main(String[] args) {
        String str = "WORKATTECH";
        
        // Step by 2, so we take pairs of characters
        for (int i = 0; i < str.length(); i += 2) {
            // Make sure we don't go out of bounds
            if (i + 1 < str.length()) {
                System.out.println(str.charAt(i) + "" + str.charAt(i + 1));
            } else {
                // If odd length, print the last single character
                System.out.println(str.charAt(i));
            }
        }
    }
}
