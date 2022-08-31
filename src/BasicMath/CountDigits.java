package BasicMath;

/*

Problem Statement: Given an integer N , write program to count number of digits in N.


 */
public class CountDigits {
    public static void main(String[] args) {
        int num = 799999;
        int count = 0;
        int temp = num;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        System.out.println("Number of digits in num " + num + " are : " + count);
    }
}
