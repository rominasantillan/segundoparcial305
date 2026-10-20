package segundoparcial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class HolaGithub {

	private JFrame frmHolaMundoGit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolaGithub window = new HolaGithub();
					window.frmHolaMundoGit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HolaGithub() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHolaMundoGit = new JFrame();
		frmHolaMundoGit.setTitle("HOLA MUNDO GIT");
		frmHolaMundoGit.setBounds(100, 100, 450, 300);
		frmHolaMundoGit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHolaMundoGit.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOLA GITHUB CON GIT");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(39, 25, 385, 204);
		frmHolaMundoGit.getContentPane().add(lblNewLabel);
	}
}
