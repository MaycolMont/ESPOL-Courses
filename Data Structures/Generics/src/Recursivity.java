public class Recursivity {
    static boolean isPalindrome(String word) {
        if (word.length() % 2 != 0) {
            return false;
        }

        Character a = word.charAt(0);
        Character b = word.charAt(word.length() - 1);
        
        if (a == b) {
            if (word.length() == 2) {
                return true;
            } else {
                return isPalindrome(word.substring(1, word.length() - 1));
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String word1 = "hola";
        String word2 = "roor";
        System.out.println(isPalindrome(word2));
    }
}
