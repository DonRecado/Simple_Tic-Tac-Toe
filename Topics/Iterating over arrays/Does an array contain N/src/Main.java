import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numbers = new int[len];
        int n;
        boolean containsN = false;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        n = scanner.nextInt();

        for (int num : numbers) {
            if (num == n) {
                containsN = true;
                break;
            }
        }
        System.out.println(containsN);
    }
}