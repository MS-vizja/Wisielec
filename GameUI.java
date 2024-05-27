import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameUI extends JFrame {
    private HangmanGame game;
    private JLabel wordLabel;
    private JTextField guessField;
    private JTextArea statsArea;
    private JLabel attemptsLabel;
    private JButton startButton;

    public GameUI(HangmanGame game) {
        this.game = game;
        setupUI();
    }

    private void setupUI() {
        setTitle("wisielec");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        wordLabel = new JLabel("slowo: ");
        guessField = new JTextField(10);
        statsArea = new JTextArea();
        attemptsLabel = new JLabel("proby: 6");
        startButton = new JButton("Start");

        setLayout(new FlowLayout());

        add(wordLabel);
        add(guessField);
        add(attemptsLabel);
        add(startButton);
        add(new JScrollPane(statsArea));

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.startGame("medium");
                updateUI();
            }
        });

        guessField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char guess = guessField.getText().charAt(0);
                game.makeGuess(guess);
                updateUI();
                if (game.isGameOver()) {
                    if (game.isWin()) {
                        JOptionPane.showMessageDialog(null, "wygrales!");
                    } else {
                        JOptionPane.showMessageDialog(null, "przegrales, haslo: " + game.getGuessedWord());
                    }
                }
                guessField.setText("");
            }
        });
    }

    private void updateUI() {
        wordLabel.setText("slowo: " + game.getGuessedWord());
        attemptsLabel.setText("proby: " + game.getAttemptsLeft());
        statsArea.setText("litery: " + game.getGuessedLetters());
    }

    public static void main(String[] args) {
        WordManager wordManager = new WordManager();
        HangmanGame game = new HangmanGame(wordManager);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameUI(game).setVisible(true);
            }
        });
    }
}
