import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOutput;
	private JButton btnPlayAgain;
	private int theNumber;
	private int numberOfTries;
	public void checkGuess() {
		String guessText = txtGuess.getText();
		String message = "";
		try {
			int guess = Integer.parseInt(guessText);
			if (guess < theNumber) {
				message = guess + " is too low. Try again.";
				numberOfTries = numberOfTries + 1;
			}
			else if (guess > theNumber) {
				message = guess + " is too high. Try again.";
				numberOfTries = numberOfTries + 1;
			}
			else {
				message = guess + " is correct. You win! You Guessed " + numberOfTries + " Times. Let's Play Again!";
				newGame();
				numberOfTries = 0;
				btnPlayAgain.setVisible(true);
			}
		} catch (Exception e) {
			message = "Enter a whole number between 1 and 100.";
		} finally {
			lblOutput.setText(message);
			txtGuess.requestFocus();
			txtGuess.selectAll();
		}
	}
	public void newGame() {
		theNumber = (int)(Math.random() * 100 + 1); 
	}
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("James’ Hi-Lo Guessing Game");
		getContentPane().setLayout(null);

		JLabel lblJamesHiloGuessing = new JLabel("James' Hi-Lo Guessing Game");
		lblJamesHiloGuessing.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblJamesHiloGuessing.setHorizontalAlignment(SwingConstants.CENTER);
		lblJamesHiloGuessing.setBounds(97, 38, 255, 24);
		getContentPane().add(lblJamesHiloGuessing);

		JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 100:");
		lblGuessANumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGuessANumber.setBounds(69, 100, 243, 16);
		getContentPane().add(lblGuessANumber);

		txtGuess = new JTextField();
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		txtGuess.setBounds(314, 95, 56, 26);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);

		JButton btnGuess = new JButton("Guess");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setBounds(166, 154, 117, 29);
		getContentPane().add(btnGuess);

		lblOutput = new JLabel("Enter a number and click guess!");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(6, 221, 438, 16);
		getContentPane().add(lblOutput);
		
		btnPlayAgain = new JButton("Play Again?");
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newGame();
				btnPlayAgain.setVisible(false);
			}
		});
		btnPlayAgain.setBounds(166, 180, 117, 29);
		getContentPane().add(btnPlayAgain);
		btnPlayAgain.setVisible(false);
	}

	public static void main(String[] args) {
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(450, 300));
		theGame.setVisible(true);
		// TODO Auto-generated method stub

	}
}
