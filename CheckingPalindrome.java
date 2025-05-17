public class CheckingPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        StringBuilder revStr = new StringBuilder(str);
        boolean isPalindrome = false;
        if(str.equals(revStr.reverse().toString())){
            isPalindrome = true;
        } 
        System.out.print("Is the String Palindrome? " + isPalindrome);

    }
}
