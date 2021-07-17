package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIApp extends JFrame {

	private JPanel contentPane;
	private JTextField textPoluprecnik;
	private JTextField textPovrsina;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIApp frame = new GUIApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIApp() {
		setTitle("Aplikacija");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Unesite poluprecnik:");
		lblNewLabel.setBounds(26, 23, 102, 14);
		contentPane.add(lblNewLabel);
		
		textPoluprecnik = new JTextField();
		textPoluprecnik.setBounds(166, 20, 86, 20);
		contentPane.add(textPoluprecnik);
		textPoluprecnik.setColumns(10);
		
		JButton btnNewButton = new JButton("Izracuaj povrsinu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String poluprecnikStr=textPoluprecnik.getText().trim(); //uzima tekst iz polja
					
					int poluprecnik=Integer.parseInt(poluprecnikStr);
					double povrsina=poluprecnik*poluprecnik*3.14;
					
					textPovrsina.setText(povrsina+""); //postavlja tekst u polje
				} catch (NumberFormatException e1) {
					textPovrsina.setText("Unesite broj");
				}
			}
		});
		btnNewButton.setBounds(281, 59, 143, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblPovrsina = new JLabel("Povrsina");
		lblPovrsina.setBounds(26, 120, 46, 14);
		contentPane.add(lblPovrsina);
		
		textPovrsina = new JTextField();
		textPovrsina.setBounds(166, 117, 86, 20);
		contentPane.add(textPovrsina);
		textPovrsina.setColumns(10);
	}
}
