package prijemni.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;

public class PrijemniGUI {

	private JFrame frmPrijemniIspit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrijemniGUI window = new PrijemniGUI();
					window.frmPrijemniIspit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrijemniGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrijemniIspit = new JFrame();
		frmPrijemniIspit.setTitle("Prijemni ispit");
		frmPrijemniIspit.setBounds(100, 100, 450, 300);
		frmPrijemniIspit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrijemniIspit.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}

}
