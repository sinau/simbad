package project.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class RegistrasiGui extends JFrame {

	private JPanel contentPane;
	private JTextField textCari;
	private JLabel label;
	private JTextField textNama;
	private JLabel label_1;
	private JTextField textAsal;
	private JLabel label_2;
	private JTextField textTelepon;
	private JLabel label_3;
	private JTextField textAlamat;
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
		textCari.setBounds(10, 106, 344, 20);
		contentPane.add(textCari);
		textCari.setColumns(10);
		
		JLabel labelCari = new JLabel("");
		Image imageCari = new ImageIcon(this.getClass().getResource("/cari.png")).getImage();
		labelCari.setIcon(new ImageIcon(imageCari));
		labelCari.setBounds(364, 95, 33, 49);
		contentPane.add(labelCari);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 170, 387, 123);
		contentPane.add(panel);
		panel.setLayout(null);
		
		label = new JLabel("Nama");
		label.setForeground(Color.BLACK);
		label.setBounds(10, 14, 132, 14);
		panel.add(label);
		
		textNama = new JTextField();
		textNama.setEnabled(false);
		textNama.setEditable(false);
		textNama.setColumns(10);
		textNama.setBounds(139, 11, 237, 20);
		panel.add(textNama);
		
		label_1 = new JLabel("Asal Universitas");
		label_1.setForeground(Color.BLACK);
		label_1.setBounds(10, 42, 132, 14);
		panel.add(label_1);
		
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
		
		textTelepon = new JTextField();
		textTelepon.setEnabled(false);
		textTelepon.setEditable(false);
		textTelepon.setColumns(10);
		textTelepon.setBounds(139, 64, 237, 20);
		panel.add(textTelepon);
		
		label_3 = new JLabel("Alamat E-Mail");
		label_3.setForeground(Color.BLACK);
		label_3.setBounds(10, 92, 126, 14);
		panel.add(label_3);
		
		textAlamat = new JTextField();
		textAlamat.setEnabled(false);
		textAlamat.setEditable(false);
		textAlamat.setColumns(10);
		textAlamat.setBounds(139, 89, 237, 20);
		panel.add(textAlamat);
		
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
					textAlamat.setEnabled(true);
					textAsal.setEnabled(true);
					textTelepon.setEnabled(true);
					textNama.setEditable(true);
					textAlamat.setEditable(true);
					textAsal.setEditable(true);
					textTelepon.setEditable(true);
					
					cbModul.setEnabled(false);
					textCari.setEnabled(false);
				}
				else
				{
					textNama.setEnabled(false);
					textAlamat.setEnabled(false);
					textAsal.setEnabled(false);
					textTelepon.setEnabled(false);
					textNama.setEditable(false);
					textAlamat.setEditable(false);
					textAsal.setEditable(false);
					textTelepon.setEditable(false);
					
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
	}
}
