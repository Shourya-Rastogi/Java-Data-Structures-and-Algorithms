public class PalindromeString {
        public boolean isPalindrome(String s) {
            int l = 0, r = s.length() - 1;

            while (l < r) {

                while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                    l++;
                }

                while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                    r--;
                }

                if (Character.toLowerCase(s.charAt(l)) !=
                        Character.toLowerCase(s.charAt(r))) {
                    return false;
                }

                l++;
                r--;
            }

            return true;
        }

    public static void main(String[] args) {
        PalindromeString palindromeString=new PalindromeString();
        boolean baddab = palindromeString.isPalindrome("Baddab");
        System.out.println(baddab);

    }

}
