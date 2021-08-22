import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int bridges = scanner.nextInt();
        int[] bridgeHeightArray = new int[bridges];
        boolean willCrash = false;
        int crashedBridge = -1;

        for (int i = 0; i <= bridges - 1; i++) {
//            System.out.print("Please enter the height of Bridge " + (i + 1) + " : ");
            bridgeHeightArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < bridgeHeightArray.length; i++) {
            if (height >= bridgeHeightArray[i]) {
                willCrash = true;
                crashedBridge = i + 1;
                break;
            }
        }

        System.out.println(willCrash ? "Will crash on bridge " + crashedBridge : "Will not crash");


    }
}