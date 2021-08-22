import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double a;
        double b;
        double c;
        double r;


        switch (shape) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                calculateForm(a, b, c);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                calculateForm(a, b);
                break;
            case "circle":
                r = scanner.nextDouble();
                calculateForm(r);
        }

    }

    public static void calculateForm(double r) {
        double pi = 3.14;
        double area = pi * (r * r);
        System.out.println(area);
    }

    public static void calculateForm(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(area);
    }

    public static void calculateForm(double a, double b) {
        System.out.println(a * b);
    }
}