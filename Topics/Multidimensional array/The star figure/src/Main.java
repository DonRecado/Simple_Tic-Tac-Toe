import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number % 2 != 0 && number <= 15) {
            String[][] superArray = new String[number][number];

            for (int i = 0; i < superArray.length; i++) {
                System.out.println();
                for (int j = 0; j < superArray[i].length; j++) {
                    if (i == (superArray.length - 1) / 2) {
                        superArray[i][j] = "*";
                    } else if (j == (superArray[i].length - 1) / 2) {
                        superArray[i][j] = "*";
                    } else if (i == j) {
                        superArray[i][j] = "*";
                    } else if (i == (number - j - 1)) {
                        superArray[i][j] = "*";
                    } else {
                        superArray[i][j] = ".";
                    }
                    System.out.print(superArray[i][j] + " ");
                }
            }


        }


    }
}