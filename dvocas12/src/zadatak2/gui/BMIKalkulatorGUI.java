package zadatak2.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import zadatak2.poslovna_logika.BMIKalkulator;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class BMIKalkulatorGUI {
	BMIKalkulator bmiKalkulator=new BMIKalkulator();

	private JFrame frmBmiKalkulator;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblBmi;
	private JTextField visinaField;
	private JTextField tezinaField;
	private JTextField bmiField;
	private JButton btnIzracunajBMI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMIKalkulatorGUI window = new BMIKalkulatorGUI();
					window.frmBmiKalkulator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BMIKalkulatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBmiKalkulator = new JFrame();
		frmBmiKalkulator.setTitle("BMI Kalkulator");
		frmBmiKalkulator.setResizable(false);
		frmBmiKalkulator.setBounds(100, 100, 364, 300);
		frmBmiKalkulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBmiKalkulator.getContentPane().setLayout(null);
		frmBmiKalkulator.getContentPane().add(getLblNewLabel());
		frmBmiKalkulator.getContentPane().add(getLblNewLabel_1());
		frmBmiKalkulator.getContentPane().add(getLblBmi());
		frmBmiKalkulator.getContentPane().add(getVisinaField());
		frmBmiKalkulator.getContentPane().add(getTezinaField());
		frmBmiKalkulator.getContentPane().add(getBmiField());
		frmBmiKalkulator.getContentPane().add(getBtnIzracunajBMI());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Visina:");
			lblNewLabel.setBounds(28, 26, 64, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Tezina:");
			lblNewLabel_1.setBounds(28, 82, 64, 14);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblBmi() {
		if (lblBmi == null) {
			lblBmi = new JLabel("BMI:");
			lblBmi.setBounds(28, 212, 64, 14);
		}
		return lblBmi;
	}
	private JTextField getVisinaField() {
		if (visinaField == null) {
			visinaField = new JTextField();
			visinaField.setBounds(112, 23, 195, 20);
			visinaField.setColumns(10);
		}
		return visinaField;
	}
	private JTextField getTezinaField() {
		if (tezinaField == null) {
			tezinaField = new JTextField();
			tezinaField.setBounds(112, 79, 195, 20);
			tezinaField.setColumns(10);
		}
		return tezinaField;
	}
	private JTextField getBmiField() {
		if (bmiField == null) {
			bmiField = new JTextField();
			bmiField.setBounds(112, 209, 195, 20);
			bmiField.setColumns(10);
		}
		return bmiField;
	}
	private JButton getBtnIzracunajBMI() {
		if (btnIzracunajBMI == null) {
			btnIzracunajBMI = new JButton("Izracunaj BMI");
			btnIzracunajBMI.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String visinaStr=visinaField.getText().trim();
						String tezinaStr=tezinaField.getText().trim();
					
						if(!visinaStr.isEmpty() && !tezinaStr.isEmpty()) {
					
							double visina=Double.parseDouble(visinaStr);
							double tezina=Double.parseDouble(tezinaStr);
							double bmi=bmiKalkulator.izracunajBMI(visina, tezina);
							NumberFormat nf=NumberFormat.getInstance();
							nf.setMinimumFractionDigits(3); //zaokruzuje vrednost na 3 cifre
							bmiField.setText(String.valueOf(nf.format(bmi)));
						} else {
							JOptionPane.showMessageDialog(btnIzracunajBMI
									, "Niste uneli broj", "Greska!",JOptionPane.ERROR_MESSAGE);
						}
					} catch(Exception ex){
						JOptionPane.showMessageDialog(btnIzracunajBMI, "Los unos broja", "Greska!",JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnIzracunajBMI.setBounds(28, 150, 126, 23);
		}
		return btnIzracunajBMI;
	}
}
