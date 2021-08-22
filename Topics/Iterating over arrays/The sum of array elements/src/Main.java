import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        scanner.nextLine();

        int[] numbersArray = new int[len];

        for (int i = 0; i < len; i++) {
            numbersArray[i] = scanner.nextInt();
        }
        scanner.close();

        int calc = 0;

        for (int num : numbersArray) {
            calc += num;
        }

        System.out.println(calc);

    }
}