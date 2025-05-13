
public class HollowHourGlass {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            int totalChars = (2 * n - 1) - 2 * i;
            for (int j = 0; j < totalChars; j++) {
                if (j == 0 || j == totalChars - 1) {
                    System.out.print("*"); 
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            int totalChars = (2 * n - 1) - 2 * i;
            for (int j = 0; j < totalChars; j++) {
                if (j == 0 || j == totalChars - 1) {
                    System.out.print("*"); 
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
