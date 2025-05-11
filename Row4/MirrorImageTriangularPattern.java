
public class MirrorImageTriangularPattern {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        for (int i = n - 1; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
