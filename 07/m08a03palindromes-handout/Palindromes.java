class Palindromes {
    public static void main(String[] args) {
        for (String arg : args) {
            boolean isPalindrome = true;
            int i = 0;
            int j = arg.length() - 1;
            while (i < j) {
                if (arg.charAt(i) != arg.charAt(j)) {
                    isPalindrome = false;
                    break;
                }
                i++;
                j--;
            }
            if (isPalindrome) {
                System.out.println(arg + " is a palindrome");
            } else {
                System.out.println(arg + " is not a palindrome");
            }
        }
    }
}