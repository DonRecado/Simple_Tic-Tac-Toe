package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] cArray = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };

        char currentPlayer = 'X';

        printGrid(cArray);

        while (true) {
            System.out.print("Enter the coordinates: ");
            if (scanner.hasNextInt()) {
                int coreOne = scanner.nextInt();
                int coreTwo = scanner.nextInt();

                if (coreOne > 3 || coreOne < 1 || coreTwo > 3 || coreTwo < 0) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else {
                    if (cArray[coreOne - 1][coreTwo - 1] == 'X' || cArray[coreOne - 1][coreTwo - 1] == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else {
                        cArray[coreOne - 1][coreTwo - 1] = currentPlayer;
                        printGrid(cArray);
                        if (!hasWinner(cArray)) {
                            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                        } else {
                            break;
                        }
                    }
                }
            } else {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }
        }

    }

    public static void printGrid(char[][] cArray) {
        System.out.println("---------");

        for (char[] chars : cArray) {
            System.out.println("| " + chars[0] + " " + chars[1] + " " + chars[2] + " |");
        }
        System.out.println("---------");
    }

    public static boolean hasWinner(char[][] cArray) {
        int xTargetSum = 264;
        int oTargetSum = 237;
        int counter = 0;

        for (int i = 0; i < cArray.length; i++) {
            int hRowSum = 0;
            int vRowSum = 0;
            int firstVertLine = 0;
            int secondVertLine = 0;
            for (int j = 0; j < cArray[i].length; j++) {
                hRowSum += cArray[i][j];
                vRowSum += cArray[j][i];
                firstVertLine += cArray[j][j];
                secondVertLine += cArray[j][2 - j];
                if (cArray[i][j] == 'X' || cArray[i][j] == 'O') {
                    counter++;
                }
            }

            if (hRowSum == xTargetSum || vRowSum == xTargetSum || firstVertLine == xTargetSum || secondVertLine == xTargetSum) {
                System.out.println("X wins");
                return true;
            }

            if (hRowSum == oTargetSum || vRowSum == oTargetSum || firstVertLine == oTargetSum || secondVertLine == oTargetSum) {
                System.out.println("O wins");
                return true;
            }

            if (counter == 9) {
                System.out.println("Draw");
                return true;
            }

        }
        return false;
    }

}
