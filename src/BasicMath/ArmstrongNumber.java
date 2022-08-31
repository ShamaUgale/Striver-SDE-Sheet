package BasicMath;

/*

Problem Statement: Given a number, check if it is Armstrong Number or Not.

Examples:
    Example 1:
        Input:153
        Output: Yes, it is an Armstrong Number
        Explanation: 1^3 + 5^3 + 3^3 = 153

    Example 2:
        Input:170
        Output: No, it is not an Armstrong Number
        Explanation: 1^3 + 7^3 + 0^3 != 170

 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 1635;
        int armstrong = 0;
        int temp = num;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        temp = num;

        while (temp != 0) {
            int remainder = temp % 10;
            armstrong = (int)Math.pow(remainder,count) + armstrong;
            temp = temp / 10;
        }
        if(armstrong == num){
            System.out.println(num + " is an armstrong number");
        }else{
            System.out.println(num + " is not an armstrong number");
        }
    }
}
