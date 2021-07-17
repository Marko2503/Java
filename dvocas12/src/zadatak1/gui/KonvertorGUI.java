package zadatak1.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import zadatak1.poslovna_logika.Konvertor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class KonvertorGUI {

	private JFrame frmKonvertorValuta;
	private Konvertor konvertor=new Konvertor();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField dinariField;
	private JTextField evriField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JComboBox kursComboBox;
	private JLabel lblKurs;
	private JCheckBox chckbxStampajPriznanicu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KonvertorGUI window = new KonvertorGUI();
					window.frmKonvertorValuta.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KonvertorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKonvertorValuta = new JFrame();
		frmKonvertorValuta.setResizable(false);
		frmKonvertorValuta.setTitle("Konvertor valuta");
		frmKonvertorValuta.setBounds(100, 100, 322, 201);
		frmKonvertorValuta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKonvertorValuta.getContentPane().setLayout(null);
		frmKonvertorValuta.getContentPane().add(getLblNewLabel());
		frmKonvertorValuta.getContentPane().add(getLblNewLabel_1());
		frmKonvertorValuta.getContentPane().add(getDinariField());
		frmKonvertorValuta.getContentPane().add(getEvriField());
		frmKonvertorValuta.getContentPane().add(getBtnNewButton());
		frmKonvertorValuta.getContentPane().add(getBtnNewButton_1());
		frmKonvertorValuta.getContentPane().add(getKursComboBox());
		frmKonvertorValuta.getContentPane().add(getLblKurs());
		frmKonvertorValuta.getContentPane().add(getChckbxStampajPriznanicu());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Iznos u dinarima:");
			lblNewLabel.setBounds(42, 43, 97, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Iznos u evrima:");
			lblNewLabel_1.setBounds(203, 43, 91, 14);
		}
		return lblNewLabel_1;
	}
	private JTextField getDinariField() {
		if (dinariField == null) {
			dinariField = new JTextField();
			dinariField.setBounds(42, 82, 86, 20);
			dinariField.setColumns(10);
		}
		return dinariField;
	}
	private JTextField getEvriField() {
		if (evriField == null) {
			evriField = new JTextField();
			evriField.setBounds(203, 82, 86, 20);
			evriField.setColumns(10);
		}
		return evriField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dinari u evre");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String dinariStr=dinariField.getText().trim(); //uzima sadrzaj odgovarajuceg polja
					
					if(!dinariStr.isEmpty()) {
						try {
							double dinariIznos=Double.parseDouble(dinariStr);
							String vrstaKursa=kursComboBox.getSelectedItem().toString(); //uzima vrtu kursa i pretvara je u string
							double evriIznos=konvertor.konvertujDinareUEvre(dinariIznos,vrstaKursa);
							evriField.setText(String.valueOf(evriIznos));
						} catch(NumberFormatException e1){
							JOptionPane.showMessageDialog(frmKonvertorValuta, "Uneta vrednost nije broj","Greska",JOptionPane.ERROR_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(frmKonvertorValuta, "Polje za iznos ne moze biti prazno","Greska",JOptionPane.ERROR_MESSAGE);
					}
					
					if(chckbxStampajPriznanicu.isSelected()) {
						JOptionPane.showMessageDialog(frmKonvertorValuta, "Stampanje priznanice....");
					}
				}
			});
			btnNewButton.setBounds(27, 125, 106, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Evri u dinare");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String evriStr=evriField.getText().trim();
					
					if(!evriStr.isEmpty()) {
						try {
							double evriIznos=Double.parseDouble(evriStr);
							String vrstaKursa=kursComboBox.getSelectedItem().toString();
							double dinariIznos=konvertor.konvertujEvreUDinare(evriIznos,vrstaKursa);
							dinariField.setText(String.valueOf(dinariIznos));
						} catch(NumberFormatException e2) {
							JOptionPane.showMessageDialog(frmKonvertorValuta, "Uneta vrednost nije broj","Greska",JOptionPane.ERROR_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(frmKonvertorValuta, "Polje za iznos ne moze biti prazno","Greska",JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnNewButton_1.setBounds(188, 125, 106, 23);
		}
		return btnNewButton_1;
	}
	private JComboBox getKursComboBox() {
		if (kursComboBox == null) {
			kursComboBox = new JComboBox();
			kursComboBox.setModel(new DefaultComboBoxModel(new String[] {"Kupovni ", "Prodajni"}));
			kursComboBox.setBounds(69, 12, 66, 20);
		}
		return kursComboBox;
	}
	private JLabel getLblKurs() {
		if (lblKurs == null) {
			lblKurs = new JLabel("Kurs");
			lblKurs.setBounds(27, 15, 46, 14);
		}
		return lblKurs;
	}
	private JCheckBox getChckbxStampajPriznanicu() {
		if (chckbxStampajPriznanicu == null) {
			chckbxStampajPriznanicu = new JCheckBox("Stampaj priznanicu");
			chckbxStampajPriznanicu.setBounds(179, 11, 115, 23);
		}
		return chckbxStampajPriznanicu;
	}
}
