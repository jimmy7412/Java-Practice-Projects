import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SecretMassagesGUI extends JFrame {
	private JTextField txtKey;
	public SecretMassagesGUI() {
		setTitle("James' Secret Messages App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JTextArea txtIn = new JTextArea();
		txtIn.setBounds(6, 6, 588, 140);
		getContentPane().add(txtIn);
		
		JTextArea txtOut = new JTextArea();
		txtOut.setBounds(6, 232, 588, 140);
		getContentPane().add(txtOut);
		
		txtKey = new JTextField();
		txtKey.setBounds(260, 173, 70, 26);
		getContentPane().add(txtKey);
		txtKey.setColumns(10);
		
		JLabel lblKey = new JLabel("Key:");
		lblKey.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKey.setBounds(196, 178, 61, 16);
		getContentPane().add(lblKey);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
