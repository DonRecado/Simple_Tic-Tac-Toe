import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        scanner.close();
        long sum = 1;
        int i = 0;
        while (sum < number) {
            if (i == 0) {
                i++;
                continue;
            }
            sum *= i;
            if (sum > number) {
                break;
            }
            i++;
        }

        System.out.println(i);
    }
}