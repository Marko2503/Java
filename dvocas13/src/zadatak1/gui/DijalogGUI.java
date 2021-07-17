package zadatak1.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DijalogGUI extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField zameniField;
	private JTextField zamenaField;
	private TeksEditorGUI glavniProzor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DijalogGUI dialog = new DijalogGUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public DijalogGUI(TeksEditorGUI glavniProzor) {
		this();
		this.glavniProzor=glavniProzor; //dodaje konstruktor bez parametara i referencu na glavni prozor
	}

	/**
	 * Create the dialog.
	 */
	public DijalogGUI() {
		setTitle("Zamena teksta");
		setBounds(100, 100, 355, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblStringKojiSe = new JLabel("String koji se menja:");
			lblStringKojiSe.setBounds(23, 22, 118, 14);
			contentPanel.add(lblStringKojiSe);
		}
		{
			JLabel lblStringKojimSe = new JLabel("String kojim se menja:");
			lblStringKojimSe.setBounds(23, 66, 118, 14);
			contentPanel.add(lblStringKojimSe);
		}
		{
			zameniField = new JTextField();
			zameniField.setBounds(165, 19, 157, 20);
			contentPanel.add(zameniField);
			zameniField.setColumns(10);
		}
		{
			zamenaField = new JTextField();
			zamenaField.setBounds(165, 63, 157, 20);
			contentPanel.add(zamenaField);
			zamenaField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String zameni=zameniField.getText();
						String zamena=zamenaField.getText();
						
						glavniProzor.zameniTekst(zameni,zamena);
						
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false); //zatvara dijalog
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
