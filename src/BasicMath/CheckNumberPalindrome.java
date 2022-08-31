package BasicMath;

public class CheckNumberPalindrome {
    public static void main(String[] args) {
        int num = 424;
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            rev = rev * 10 + remainder;
            temp = temp / 10;
        }
        if(num == rev){
            System.out.println(num + " is a palindrome number");
        }else{
            System.out.println(num + " is not a palindrome number");
        }
    }
}
