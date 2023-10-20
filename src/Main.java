import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static String[] board;
    static String turn;

    static String checkWinner() {
        String[] winningCombinations = {"123", "147", "159", "258", "357",  "369", "456", "789"};

        for (String line : winningCombinations) {
            String sequence = "" + board[line.charAt(0) - '1'] + board[line.charAt(1) - '1'] + board[line.charAt(2) - '1'];

            if (sequence.equals("XXX")) return "X";
            if (sequence.equals("OOO")) return "O";
        }

        if (Arrays.stream(board).allMatch(s -> s.equals("X") || s.equals("O"))) return "draw";

        return null;
    }
}
