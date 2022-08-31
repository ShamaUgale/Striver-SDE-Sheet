package BasicMath;

/*
Problem Statement: Find gcd of two numbers.

Examples:

Example 1:
Input: num1 = 4, num2 = 8
Output: 4
Explanation: Since 4 is the greatest number which divides both num1 and num2.

Example 2:
Input: num1 = 3, num2 = 6
Output: 3
Explanation: Since 4 is the greatest number which divides both num1 and num2.

 */
public class FindGCDorHCF {
    public static void main(String args[]) {
        int num1 = 3, num2 = 6;
        int ans = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ans = i;
            }
        }
        System.out.print("The GCD of the two number is "+ans);
    }
}
