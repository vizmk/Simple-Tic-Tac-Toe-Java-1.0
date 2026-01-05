package tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: 9 caratteri (X, O, _). Esempio: O_OXXO_XX
        String input = scanner.nextLine();

        // Se vuoi essere safe: se arrivano spazi, li consideriamo vuoti
        input = input.replace(' ', '_');

        char[] cells = input.toCharArray();

        printBoard(cells);
    }

    private static void printBoard(char[] cells) {
        System.out.println("---------");
        System.out.println("| " + toCell(cells[0]) + " " + toCell(cells[1]) + " " + toCell(cells[2]) + " |");
        System.out.println("| " + toCell(cells[3]) + " " + toCell(cells[4]) + " " + toCell(cells[5]) + " |");
        System.out.println("| " + toCell(cells[6]) + " " + toCell(cells[7]) + " " + toCell(cells[8]) + " |");
        System.out.println("---------");
    }

    
    private static char toCell(char c) {
        return (c == '_') ? ' ' : c;
    }
}
