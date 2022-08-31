package BasicRecursion;

public class PrintNTimes {
    static int count = 1;

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    private static void print(int n) {
        if (count > n) {
            return;
        }
        System.out.println(count);
        count++;
        print(n);
    }
}
