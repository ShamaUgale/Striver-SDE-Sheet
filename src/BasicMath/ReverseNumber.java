package BasicMath;

/*

Problem Statement: Given a number N reverse the number and print it.

 */
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 423;
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            rev = rev * 10 + remainder;
            temp = temp / 10;
        }
        System.out.println(rev);
    }
}
