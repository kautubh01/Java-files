public class Pattern {

    static void printAsteriskPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void printAsteriskPattern1(int m) {
        for (int i = m; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printAsteriskPattern(5);
        System.out.println();
        printAsteriskPattern1(9);
    }
}
