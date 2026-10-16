
import java.util.Scanner;

public class PatternPrograms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== 12 Pattern Programs in Java =====");
        System.out.println("1. Solid Square");
        System.out.println("2. Right-Angled Triangle");
        System.out.println("3. Inverted Right Triangle");
        System.out.println("4. Pyramid");
        System.out.println("5. Inverted Pyramid");
        System.out.println("6. Diamond");
        System.out.println("7. Hollow Square");
        System.out.println("8. Number Triangle");
        System.out.println("9. Floyd's Triangle");
        System.out.println("10. Alphabet Triangle");
        System.out.println("11. 0-1 Triangle");
        System.out.println("12. Butterfly Pattern");

        System.out.print("Choose a pattern (1-12): ");
        int choice = sc.nextInt();

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        System.out.println("\nOutput:\n");

        switch (choice) {
            case 1:
                solidSquare(n);
                break;
            case 2:
                rightTriangle(n);
                break;
            case 3:
                invertedTriangle(n);
                break;
            case 4:
                pyramid(n);
                break;
            case 5:
                invertedPyramid(n);
                break;
            case 6:
                diamond(n);
                break;
            case 7:
                hollowSquare(n);
                break;
            case 8:
                numberTriangle(n);
                break;
            case 9:
                floydTriangle(n);
                break;
            case 10:
                alphabetTriangle(n);
                break;
            case 11:
                zeroOneTriangle(n);
                break;
            case 12:
                butterfly(n);
                break;
            default:
                System.out.println("Invalid choice! Choose 1-12.");
        }

        sc.close();
    }

    // 1. Solid Square
    static void solidSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Right-Angled Triangle
    static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Inverted Right Triangle
    static void invertedTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 4. Pyramid
    static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 5. Inverted Pyramid
    static void invertedPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 6. Diamond
    static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 7. Hollow Square
    static void hollowSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 8. Number Triangle
    static void numberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 9. Floyd's Triangle
    static void floydTriangle(int n) {
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    // 10. Alphabet Triangle
    static void alphabetTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }

    // 11. 0-1 Triangle
    static void zeroOneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // 12. Butterfly Pattern
    static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
