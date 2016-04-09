package project.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import java.awt.Button;

public class RegistrasiGui extends JFrame {

	private JPanel contentPane;
	private JTextField textCari;
	private JLabel lblNama;
	private JTextField textNama;
	private JLabel lblUniv;
	private JTextField textAsal;
	private JLabel label_2;
	private JTextField lblTelp;
	private JLabel label_3;
	private JTextField lblMail;
	private JLabel label_4;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrasiGui frame = new RegistrasiGui();
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
	public RegistrasiGui() {
		setTitle("Registrasi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 495);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		textCari = new JTextField();
		textCari.setBounds(10, 106, 303, 20);
		contentPane.add(textCari);
		textCari.setColumns(10);
		Image imageCari = new ImageIcon(this.getClass().getResource("/cari.png")).getImage();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 170, 387, 123);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNama = new JLabel("Nama");
		lblNama.setForeground(Color.BLACK);
		lblNama.setBounds(10, 14, 132, 14);
		panel.add(lblNama);
		
		textNama = new JTextField();
		textNama.setEnabled(false);
		textNama.setEditable(false);
		textNama.setColumns(10);
		textNama.setBounds(139, 11, 237, 20);
		panel.add(textNama);
		
		lblUniv = new JLabel("Asal Universitas");
		lblUniv.setForeground(Color.BLACK);
		lblUniv.setBounds(10, 42, 132, 14);
		panel.add(lblUniv);
		
		textAsal = new JTextField();
		textAsal.setEnabled(false);
		textAsal.setEditable(false);
		textAsal.setColumns(10);
		textAsal.setBounds(139, 39, 237, 20);
		panel.add(textAsal);
		
		label_2 = new JLabel("Telepon");
		label_2.setForeground(Color.BLACK);
		label_2.setBounds(10, 67, 126, 14);
		panel.add(label_2);
		
		lblTelp = new JTextField();
		lblTelp.setEnabled(false);
		lblTelp.setEditable(false);
		lblTelp.setColumns(10);
		lblTelp.setBounds(139, 64, 237, 20);
		panel.add(lblTelp);
		
		label_3 = new JLabel("Alamat E-Mail");
		label_3.setForeground(Color.BLACK);
		label_3.setBounds(10, 92, 126, 14);
		panel.add(label_3);
		
		lblMail = new JTextField();
		lblMail.setEnabled(false);
		lblMail.setEditable(false);
		lblMail.setColumns(10);
		lblMail.setBounds(139, 89, 237, 20);
		panel.add(lblMail);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(10, 304, 191, 70);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox cbModul = new JComboBox();
		cbModul.setBounds(10, 36, 171, 20);
		panel_1.add(cbModul);
		
		JLabel lblPilihModul = new JLabel("Modul");
		lblPilihModul.setForeground(Color.BLACK);
		lblPilihModul.setBounds(10, 11, 132, 14);
		panel_1.add(lblPilihModul);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(206, 304, 191, 70);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblEvent = new JLabel("Event");
		lblEvent.setForeground(Color.BLACK);
		lblEvent.setBounds(10, 11, 132, 14);
		panel_2.add(lblEvent);
		
		JComboBox cbEvent = new JComboBox();
		cbEvent.setBounds(10, 36, 171, 20);
		panel_2.add(cbEvent);
		
		JCheckBox checkboxNonAnggota = new JCheckBox("Non Anggota");
		checkboxNonAnggota.setForeground(new Color(255, 255, 255));
		checkboxNonAnggota.setBackground(new Color(0, 0, 51));
		checkboxNonAnggota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkboxNonAnggota.isSelected()){
					textNama.setEnabled(true);
					lblMail.setEnabled(true);
					textAsal.setEnabled(true);
					lblTelp.setEnabled(true);
					textNama.setEditable(true);
					lblMail.setEditable(true);
					textAsal.setEditable(true);
					lblTelp.setEditable(true);
					
					cbModul.setEnabled(false);
					textCari.setEnabled(false);
				}
				else
				{
					textNama.setEnabled(false);
					lblMail.setEnabled(false);
					textAsal.setEnabled(false);
					lblTelp.setEnabled(false);
					textNama.setEditable(false);
					lblMail.setEditable(false);
					textAsal.setEditable(false);
					lblTelp.setEditable(false);
					
					cbModul.setEnabled(true);
					textCari.setEnabled(true);
				}
			}
		});
		
		
		checkboxNonAnggota.setBounds(309, 133, 97, 23);
		contentPane.add(checkboxNonAnggota);
		
		JButton buttonBayar = new JButton("Bayar");
		buttonBayar.setBounds(164, 419, 89, 23);
		buttonBayar.setEnabled(false);
		contentPane.add(buttonBayar);
		
		JButton buttonSimpan = new JButton("Simpan");
		buttonSimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonSimpan.setEnabled(false);
				buttonBayar.setEnabled(true);
			}
		});
		buttonSimpan.setBounds(164, 385, 89, 23);
		contentPane.add(buttonSimpan);
		
		JLabel labelSinauAcademy = new JLabel("");
		Image imageSinauAcademy = new ImageIcon(this.getClass().getResource("/sinauacademy.png")).getImage();
		labelSinauAcademy.setIcon(new ImageIcon(imageSinauAcademy));
		labelSinauAcademy.setBounds(35, 11, 335, 84);
		contentPane.add(labelSinauAcademy);	
		
		Button buttonCari = new Button("Cari");
		buttonCari.setBounds(327, 104, 70, 22);
		contentPane.add(buttonCari);
	}
}
