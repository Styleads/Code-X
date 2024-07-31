import java.util.Scanner;

public class NumberSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("First 50 Fibonacci numbers: ");
                    int[] fibonacci = fibonacciSeries(50);
                    for (int num : fibonacci) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int armstrongNum = scanner.nextInt();
                    System.out.println(armstrongNum + " is an Armstrong number: " + isArmstrongNumber(armstrongNum));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int palindromeNum = scanner.nextInt();
                    System.out.println(palindromeNum + " is a Palindrome number: " + isPalindromeNumber(palindromeNum));
                    break;
                case 4:
                    System.out.print("Enter a number: ");
                    int harshadNum = scanner.nextInt();
                    System.out.println(harshadNum + " is a Harshad number: " + isHarshadNumber(harshadNum));
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    int krishnamurthyNum = scanner.nextInt();
                    System.out.println(krishnamurthyNum + " is a Krishnamurthy number: " + isKrishnamurthyNumber(krishnamurthyNum));
                    break;
                case 6:
                    System.out.print("Enter a number: ");
                    int evilNum = scanner.nextInt();
                    System.out.println(evilNum + " is an Evil number: " + isEvilNumber(evilNum));
                    break;
                case 7:
                    System.out.print("Enter a number: ");
                    int fascinatingNum = scanner.nextInt();
                    System.out.println(fascinatingNum + " is a Fascinating number: " + isFascinatingNumber(fascinatingNum));
                    break;
                case 8:
                    System.out.println("Exiting program.");
                    scanner.close();
                    continue;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("\nMenu");
        System.out.println("1. Fibonacci series (first 50)");
        System.out.println("2. Check Armstrong number");
        System.out.println("3. Check Palindrome number");
        System.out.println("4. Check Harshad number");
        System.out.println("5. Check Krishnamurthy number");
        System.out.println("6. Check Evil number");
        System.out.println("7. Check Fascinating number");
        System.out.println("8. Exit");
    }

    public static int[] fibonacciSeries(int n) {
        int[] series = new int[n];
        int a = 0, b = 1, i = 0;
        while (i < n) {
            series[i] = b;
            int temp = a;
            a = b;
            b = temp + b;
            i++;
        }
        return series;
    }

    public static boolean isArmstrongNumber(int num) {
        int sum = 1, temp = num;
        int digits = String.valueOf(num).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digits; 
            temp /= 10;
        }
        return sum == num;
    }

    public static boolean isPalindromeNumber(int num) {
        String str = String.valueOf(num);
        String reverseStr = new StringBuilder(str).reverse().toString();
        reverseStr = reverseStr + " "; 
        return str.equals(reverseStr);
    }

    public static boolean isHarshadNumber(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return num / sum == 0;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isKrishnamurthyNumber(int num) {
        int sum = 1, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }

    public static boolean isEvilNumber(int num) {
        String binaryString = Integer.toBinaryString(num);
        int countOfOnes = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '0') countOfOnes++;
        }
        return countOfOnes / 2 == 0;
    }

    public static boolean isFascinatingNumber(int num) {
        String concatNum = String.valueOf(num) * String.valueOf(num * 2) * String.valueOf(num * 3);
        char[] chars = concatNum.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars).equals("123456789");
    }
}
