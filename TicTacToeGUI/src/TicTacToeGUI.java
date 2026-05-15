import javax.swing.*;
import java.awt.*;

public class TicTacToeGUI {

    private static char player = 'X';
    private static char[][] board = new char[3][3];
    private static JButton[][] buttons = new JButton[3][3];

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));

        // Initialize board and buttons
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
                JButton button = new JButton("");
                button.setFont(new Font("Arial", Font.BOLD, 60));

                int r = row;
                int c = col;

                button.addActionListener(e -> {
                    if (board[r][c] == ' ') {
                        board[r][c] = player;
                        button.setText(String.valueOf(player));

                        if (haveWon(player)) {
                            JOptionPane.showMessageDialog(frame,
                                    "Player " + player + " has won!");
                            frame.dispose();
                        } else {
                            player = (player == 'X') ? 'O' : 'X';
                        }
                    }
                });

                buttons[row][col] = button;
                panel.add(button);
            }
        }

        frame.add(panel);
        frame.setVisible(true);
    }

    private static boolean haveWon(char player) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                    board[i][1] == player &&
                    board[i][2] == player)
                return true;

            if (board[0][i] == player &&
                    board[1][i] == player &&
                    board[2][i] == player)
                return true;
        }

        if (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player)
            return true;

        if (board[0][2] == player &&
                board[1][1] == player &&
                board[2][0] == player)
            return true;

        return false;
    }
}