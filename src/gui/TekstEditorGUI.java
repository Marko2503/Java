package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class TekstEditorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textImeFajla;
	private TekstEditorLogika tekstLogika=new TekstEditorLogika();
	private JTextArea textPolje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TekstEditorGUI frame = new TekstEditorGUI();
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
	public TekstEditorGUI() {
		setTitle("Tekst editor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100, 10));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(null);
		
		JLabel lblImeFajla = new JLabel("Ime fajla:");
		lblImeFajla.setBounds(26, 11, 46, 14);
		panel.add(lblImeFajla);
		
		textImeFajla = new JTextField();
		textImeFajla.setBounds(10, 30, 86, 20);
		panel.add(textImeFajla);
		textImeFajla.setColumns(10);
		
		JButton btnNewButton = new JButton("Ucitaj");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String fajl=textImeFajla.getText().trim();
					String tekst=tekstLogika.ucitajTekst(fajl);
					textPolje.setText(tekst);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(TekstEditorGUI.this, "Greska prilikom ucitavanje", "Greska", JOptionPane.ERROR_MESSAGE); //iskacuci prozor
				}
			}
		});
		btnNewButton.setBounds(10, 61, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Obrisi");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPolje.setText("");
			}
		});
		btnNewButton_1.setBounds(10, 95, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnSacuvaj = new JButton("Sacuvaj");
		btnSacuvaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String fajl=textPolje.getText().trim();
					String tekst=textPolje.getText();
					tekstLogika.upisiTekst(fajl, tekst);
					JOptionPane.showMessageDialog(TekstEditorGUI.this, "Uspesno sacuvano", "Potvrda", JOptionPane.INFORMATION_MESSAGE); 
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(TekstEditorGUI.this, "Greska prilikom cuvanja", "Greska", JOptionPane.ERROR_MESSAGE); 
				}
				
			}
		});
		btnSacuvaj.setBounds(10, 125, 89, 23);
		panel.add(btnSacuvaj);
		
		JButton btnZameni = new JButton("Zameni");
		btnZameni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZamenaTekstaGUI zamena=new ZamenaTekstaGUI(TekstEditorGUI.this);
				zamena.setVisible(true); //otvara drugi prozor pritiskom na dugme
			}
		});
		btnZameni.setBounds(10, 159, 89, 23);
		panel.add(btnZameni);
		
		JButton btnAnaliza = new JButton("Analiza");
		btnAnaliza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int brojZnakova;
				int brojReci;
				String tekst=textPolje.getText();
				
				brojZnakova=tekst.length();
				
				String[] nizReci=tekst.split(" ");
				
				brojReci=nizReci.length;
				
				String poruka="Broj znakova u tekstu: " +brojZnakova+ ".Broj reci: " +brojReci;
				
				if(tekst.length()>0) {
					JOptionPane.showMessageDialog(TekstEditorGUI.this,poruka, "Analiza teksta", JOptionPane.INFORMATION_MESSAGE); 
				} else {
					JOptionPane.showMessageDialog(TekstEditorGUI.this,"Nije unet tekst", "Analiza teksta", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAnaliza.setBounds(10, 188, 89, 23);
		panel.add(btnAnaliza);
		
		JButton button_2_1 = new JButton("Izadji");
		button_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int izbor=JOptionPane.showConfirmDialog(TekstEditorGUI.this, "Da li zelite da izadjete iz programa?", "Potvrda", JOptionPane.YES_NO_OPTION); //povratna vrednost je odgovor tipa integer
				
				if(izbor==JOptionPane.YES_OPTION) {
					dispose(); //zatvara prozor
				}
			}
		});
		button_2_1.setBounds(10, 217, 89, 23);
		panel.add(button_2_1);
		
		JTextArea textPolje = new JTextArea();
		contentPane.add(textPolje, BorderLayout.CENTER);
	}

	public void zamena(String strZaMenjanje, String strZamena) {
		
			String tekst=textPolje.getText();
			
			String zamenjenTekst=tekst.replaceAll(strZaMenjanje, strZamena); //menja tekst u stringovima
			
			textPolje.setText(zamenjenTekst);
		
		
	}

}
