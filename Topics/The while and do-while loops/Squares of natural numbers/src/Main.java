import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int i = 1;


        while (true) {
            int temp = i * i;
            if (temp > n) {
                break;
            } else {
                System.out.println(temp);
            }
            i++;
        }

    }
}