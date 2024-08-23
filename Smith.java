import java.util.Scanner;

public class Smith {

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSmithNumber(int num) {
        if (isPrime(num)) {
            return false;
        }

        int sumOriginalDigits = sumOfDigits(num);

        int sumFactorDigits = 0;
        int tempNum = num;

        for (int i = 2; i <= tempNum; i++) {
            while (tempNum % i == 0) {
                sumFactorDigits += sumOfDigits(i);
                tempNum /= i;
            }
        }

        return sumOriginalDigits == sumFactorDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isSmithNumber(num)) {
            System.out.println(num + " is a Smith number.");
        } else {
            System.out.println(num + " is not a Smith number.");
        }

        sc.close();
    }
}
