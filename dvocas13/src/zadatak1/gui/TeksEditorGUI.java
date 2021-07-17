package zadatak1.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import zadatak1.poslovna_logika.TekstDemo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class TeksEditorGUI {

	private JFrame frmTekstEditor;
	private JTextArea textArea;
	private JPanel panel;
	private JTextField nazivFajlaField;
	private JLabel lblNewLabel;
	private JButton btnZameni;
	private JButton btnAnaliza;
	private JButton btnObrisi;
	private JButton btnIzadji;
	private JButton btnUcitaj;
	private JButton btnSacuvaj;
	private TekstDemo tekstDemo=new TekstDemo();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeksEditorGUI window = new TeksEditorGUI();
					window.frmTekstEditor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TeksEditorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTekstEditor = new JFrame();
		frmTekstEditor.setTitle("Tekst Editor");
		frmTekstEditor.setBounds(100, 100, 364, 320);
		frmTekstEditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTekstEditor.getContentPane().setLayout(new BorderLayout(0, 0));
		frmTekstEditor.getContentPane().add(getTextArea(), BorderLayout.CENTER);
		frmTekstEditor.getContentPane().add(getPanel(), BorderLayout.WEST);
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(175, 10));
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getNazivFajlaField());
			panel.add(getBtnZameni());
			panel.add(getBtnObrisi());
			panel.add(getBtnAnaliza());
			panel.add(getBtnIzadji());
			panel.add(getBtnUcitaj());
			panel.add(getBtnSacuvaj());
		}
		return panel;
	}
	private JTextField getNazivFajlaField() {
		if (nazivFajlaField == null) {
			nazivFajlaField = new JTextField();
			nazivFajlaField.setBounds(10, 36, 153, 20);
			nazivFajlaField.setColumns(10);
		}
		return nazivFajlaField;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Ime fajla:");
			lblNewLabel.setBounds(57, 11, 106, 14);
		}
		return lblNewLabel;
	}
	private JButton getBtnZameni() {
		if (btnZameni == null) {
			btnZameni = new JButton("Zameni");
			btnZameni.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DijalogGUI dijalogZamena=new DijalogGUI(TeksEditorGUI.this); //referenca na dijalog
					
					dijalogZamena.setVisible(true);
				}
			});
			btnZameni.setBounds(20, 179, 127, 23);
		}
		return btnZameni;
	}
	private JButton getBtnAnaliza() {
		if (btnAnaliza == null) {
			btnAnaliza = new JButton("Analiza");
			btnAnaliza.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String tekst=textArea.getText();
					int brojZnakova=tekst.length();
					int brojReci;
					String[] reci=tekst.split(" ");
					
					brojReci=reci.length;
					
					JOptionPane.showMessageDialog(frmTekstEditor, "Broj znakova u tekstu: " +brojZnakova+ ".Broj reci: " +brojReci,"Analiza teksta",JOptionPane.INFORMATION_MESSAGE);
				}
			});
			btnAnaliza.setBounds(20, 213, 127, 23);
		}
		return btnAnaliza;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText("");
				}
			});
			btnObrisi.setBounds(20, 111, 127, 23);
		}
		return btnObrisi;
	}
	private JButton getBtnIzadji() {
		if (btnIzadji == null) {
			btnIzadji = new JButton("Izadji");
			btnIzadji.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int odgovor=JOptionPane.showConfirmDialog(null, "Da li ste sigurni da zelite da izadjete?",
							"Potvrda",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE); //moze i frmIme umesto null i bez QUESTION_MESSAGE
					
					if(odgovor==JOptionPane.YES_OPTION) {
						System.exit(0); //izlazak iz programa
					}
				}});
			btnIzadji.setBounds(20, 247, 127, 23);
		}
		return btnIzadji;
	}
	private JButton getBtnUcitaj() {
		if (btnUcitaj == null) {
			btnUcitaj = new JButton("Ucitaj");
			btnUcitaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String nazivFajla=nazivFajlaField.getText().trim();
					try {
						String tekst=tekstDemo.ucitajTekst(nazivFajla);
						textArea.setText(tekst);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(frmTekstEditor, "Greksa prilikom ucitavanja teksta.","Greska",JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnUcitaj.setBounds(20, 77, 127, 23);
		}
		return btnUcitaj;
	}
	private JButton getBtnSacuvaj() {
		if (btnSacuvaj == null) {
			btnSacuvaj = new JButton("Sacuvaj");
			btnSacuvaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String teskt=textArea.getText();
					String nazivFajla=nazivFajlaField.getText().trim();
					
					try {
						tekstDemo.upisiTekst(nazivFajla, teskt);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(frmTekstEditor, "Greska prilikom upiivanja teksta.","Greska",JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnSacuvaj.setBounds(20, 145, 127, 23);
		}
		return btnSacuvaj;
	}

	public void zameniTekst(String zameni, String zamena) {
		String tekst=textArea.getText();
		String zamenjenTekst=tekst.replaceAll(zameni, zamena);
		textArea.setText(zamenjenTekst);
	}
}
