import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numbers = new int[len];
        int n;
        int counter = 0;
        scanner.nextLine();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.nextLine();
        n = scanner.nextInt();

        for (int num : numbers) {
            if (num == n) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}