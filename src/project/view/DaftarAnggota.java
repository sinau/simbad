package project.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

import java.awt.Font;

import javax.swing.border.SoftBevelBorder;

import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.JRadioButton;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class DaftarAnggota extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaftarAnggota frame = new DaftarAnggota();
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
	public DaftarAnggota() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Santoso\\workspace\\ProjectAngkatan2\\pictureicon\\anggota.png"));
		setFont(new Font("Times New Roman", Font.PLAIN, 12));
		setTitle("Daftar Anggota");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 388);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(90, 102, 409, 204);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNama = new JLabel("Nama");
		lblNama.setForeground(new Color(0, 0, 0));
		lblNama.setBounds(10, 42, 132, 14);
		panel.add(lblNama);
		
		textField = new JTextField();
		textField.setBounds(139, 39, 237, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblAlamat = new JLabel("Jenis Kelamin");
		lblAlamat.setForeground(new Color(0, 0, 0));
		lblAlamat.setBounds(10, 64, 126, 14);
		panel.add(lblAlamat);
		
		JLabel label = new JLabel("Alamat");
		label.setForeground(new Color(0, 0, 0));
		label.setBounds(10, 89, 132, 14);
		panel.add(label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(139, 86, 237, 20);
		panel.add(textField_2);
		
		JLabel lblAsalUniversitas = new JLabel("Asal Universitas");
		lblAsalUniversitas.setForeground(new Color(0, 0, 0));
		lblAsalUniversitas.setBounds(10, 114, 132, 14);
		panel.add(lblAsalUniversitas);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(139, 111, 237, 20);
		panel.add(textField_3);
		
		JLabel lblNomorHandphone = new JLabel("Telepon");
		lblNomorHandphone.setForeground(new Color(0, 0, 0));
		lblNomorHandphone.setBounds(10, 139, 126, 14);
		panel.add(lblNomorHandphone);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(139, 136, 237, 20);
		panel.add(textField_4);
		
		JLabel lblAlamatEmail = new JLabel("Alamat E-Mail");
		lblAlamatEmail.setForeground(new Color(0, 0, 0));
		lblAlamatEmail.setBounds(10, 164, 126, 14);
		panel.add(lblAlamatEmail);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(139, 161, 237, 20);
		panel.add(textField_5);
		
		JLabel lblNomorAnggota = new JLabel("Nomor Anggota");
		lblNomorAnggota.setForeground(new Color(0, 0, 0));
		lblNomorAnggota.setBounds(10, 17, 132, 14);
		panel.add(lblNomorAnggota);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(139, 14, 237, 20);
		panel.add(textField_6);
		
		JRadioButton rbLakilaki = new JRadioButton("Laki - Laki");
		rbLakilaki.setForeground(new Color(0, 0, 0));
		rbLakilaki.setBackground(new Color(0, 128, 128));
		rbLakilaki.setBounds(139, 63, 109, 23);
		panel.add(rbLakilaki);
		
		JRadioButton rbPerempuan = new JRadioButton("Perempuan");
		rbPerempuan.setForeground(new Color(0, 0, 0));
		rbPerempuan.setBackground(new Color(0, 128, 128));
		rbPerempuan.setBounds(267, 63, 109, 23);
		panel.add(rbPerempuan);
		
		JButton btnNewButton = new JButton("Simpan");
		btnNewButton.setBounds(257, 317, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel sinauAcademy = new JLabel("");
		Image imageSinauAcademy = new ImageIcon(this.getClass().getResource("/sinauacademy.png")).getImage();
		sinauAcademy.setIcon(new ImageIcon(imageSinauAcademy));
		sinauAcademy.setBounds(134, 11, 327, 70);
		contentPane.add(sinauAcademy);
		
		
	}
}
