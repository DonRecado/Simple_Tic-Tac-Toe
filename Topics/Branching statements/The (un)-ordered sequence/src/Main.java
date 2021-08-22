import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
//        ASC = true DESC = false
        boolean ascDesc;

        boolean status = true;

        if (firstNumber != secondNumber) {
            ascDesc = firstNumber < secondNumber;
        } else {
            while (true) {
                int newNumber = -1;
                if (scanner.hasNextInt()) {
                    newNumber = scanner.nextInt();
                }
                if (newNumber != secondNumber && newNumber != -1) {
                    secondNumber = newNumber;
                    ascDesc = firstNumber < secondNumber;
                    break;
                }
            }
        }

        while (true) {
            int tempNumber = 0;
            if (scanner.hasNextInt()) {
                tempNumber = scanner.nextInt();
            }
            if (tempNumber == 0) {
                break;
            }

            if (status) {
                if ((!ascDesc || tempNumber < secondNumber) && (ascDesc || tempNumber > secondNumber)) {
                    status = false;
                } else {
                    secondNumber = tempNumber;
                }
            }
        }
        scanner.close();
        System.out.println(status);
    }
}