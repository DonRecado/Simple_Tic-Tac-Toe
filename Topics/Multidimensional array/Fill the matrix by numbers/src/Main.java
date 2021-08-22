import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 100) {
            int[][] graphic = new int[n][n];

            for (int i = 0; i < graphic.length; i++) {
                System.out.println();
                for (int j = 0; j < graphic[i].length; j++) {
                    if (i == j) {
                        graphic[i][j] = 0;
                    } else {
                        int temp = (i - j < 0) ? -(i - j) : i - j;
                        graphic[i][j] = temp;
                    }
                    System.out.print(graphic[i][j] + " ");
                }
            }
        }
    }
}