import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numberArray = new int[len];
        int counter = 0;
        int max = 0;


        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = scanner.nextInt();
            if (counter != 0) {
                if (numberArray[i] > numberArray[i - 1]) {
                    counter++;
                    if (counter > max) {
                        max = counter;
                    }
                } else {
                    if (counter > max) {
                        max = counter;
                    }
                    counter = 1;
                }
            } else {
                counter++;
                if (counter > max) {
                    max = counter;
                }
            }
        }
        System.out.println(max);

    }
}