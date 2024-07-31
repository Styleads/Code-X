import java.util.Scanner;

public class PatternPrinter {

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int height) {
        for (int i = 0; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

        }
    }

    public static void printNumberTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printDiamond(int height) {
        if (height % 2 == 0) {
            System.out.println("Height must be an odd number.");
            return;
        }
        int n = height / 2;
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPyramid(int height) {
        for (int i = 1; i < height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printHollowSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printNumberRightTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printHollowDiamond(int height) {
        if (height % 2 == 0) {
            System.out.println("Height must be an odd number.");
            return;
        }
        int n = height / 2;
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0 || k == 2 * i || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0 || k == 2 * i || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Pattern Printer Menu:");
            System.out.println("1. Print Square");
            System.out.println("2. Print Right-Angle Triangle");
            System.out.println("3. Print Number Triangle");
            System.out.println("4. Print Diamond");
            System.out.println("5. Print Pyramid");
            System.out.println("6. Print Hollow Square");
            System.out.println("7. Print Number Right-Angle Triangle");
            System.out.println("8. Print Hollow Diamond");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the size of the square: ");
                int size = scanner.nextInt();
                printSquare(size);
            } else if (choice == 2) {
                System.out.print("Enter the height of the triangle: ");
                int height = scanner.nextInt();
                printTriangle(height);
            } else if (choice == 3) {
                System.out.print("Enter the height of the number triangle: ");
                int height = scanner.nextInt();
                printNumberTriangle(height);
            } else if (choice == 4) {
                System.out.print("Enter the height of the diamond (odd number): ");
                int height = scanner.nextInt();
                printDiamond(height);
            } else if (choice == 5) {
                System.out.print("Enter the height of the pyramid: ");
                int height = scanner.nextInt();
                printPyramid(height);
            } else if (choice == 6) {
                System.out.print("Enter the size of the hollow square: ");
                int size = scanner.nextInt();
                printHollowSquare(size);
            } else if (choice == 7) {
                System.out.print("Enter the height of the number right-angle triangle: ");
                int height = scanner.nextInt();
                printNumberRightTriangle(height);
            } else if (choice == 8) {
                System.out.print("Enter the height of the hollow diamond (odd number): ");
                int height = scanner.nextInt();
                printHollowDiamond(height);
            } else if (choice == 9) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
