package project.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import java.awt.Font;

public class DaftarGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaftarGui frame = new DaftarGui();
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
	public DaftarGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 595);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDaftar = new JLabel("PENDAFTARAN");
		lblDaftar.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
		lblDaftar.setForeground(Color.RED);
		lblDaftar.setBounds(210, 11, 131, 14);
		contentPane.add(lblDaftar);
		
		textField = new JTextField();
		textField.setBounds(10, 61, 238, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 109, 238, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNama = new JLabel("NAMA");
		lblNama.setForeground(Color.WHITE);
		lblNama.setBounds(10, 92, 46, 14);
		contentPane.add(lblNama);
		
		JLabel lblTempatLahir = new JLabel("TEMPAT LAHIR");
		lblTempatLahir.setForeground(Color.WHITE);
		lblTempatLahir.setBounds(10, 185, 82, 14);
		contentPane.add(lblTempatLahir);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 245, 238, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTanggalLahir = new JLabel("TANGGAL LAHIR\t");
		lblTanggalLahir.setForeground(Color.WHITE);
		lblTanggalLahir.setBounds(10, 229, 183, 14);
		contentPane.add(lblTanggalLahir);
		
		JLabel lblJenisKelamin = new JLabel("JENIS KELAMIN");
		lblJenisKelamin.setForeground(Color.WHITE);
		lblJenisKelamin.setBounds(8, 276, 84, 14);
		contentPane.add(lblJenisKelamin);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 336, 238, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAsalUniversitasacademik = new JLabel("PERGURUAN TINGGI/PERUSAHAAN");
		lblAsalUniversitasacademik.setForeground(Color.WHITE);
		lblAsalUniversitasacademik.setBounds(10, 321, 190, 14);
		contentPane.add(lblAsalUniversitasacademik);
		
		JButton btnDaftar = new JButton("DAFTAR");
		btnDaftar.setBounds(111, 470, 89, 23);
		contentPane.add(btnDaftar);
		
		JButton btnPilihJadwal = new JButton("PILIH JADWAL");
		btnPilihJadwal.setBounds(293, 470, 110, 23);
		contentPane.add(btnPilihJadwal);
		
		JLabel lblNoid = new JLabel("NO.ID");
		lblNoid.setForeground(Color.WHITE);
		lblNoid.setBounds(14, 42, 46, 14);
		contentPane.add(lblNoid);
		
		JLabel lblAlamat = new JLabel("ALAMAT");
		lblAlamat.setForeground(Color.WHITE);
		lblAlamat.setBounds(10, 140, 46, 14);
		contentPane.add(lblAlamat);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 154, 461, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 198, 242, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblHhbbtttt = new JLabel("hh/bb/tttt");
		lblHhbbtttt.setBounds(140, 229, 82, 14);
		contentPane.add(lblHhbbtttt);
		
		JLabel lblNoTelepon = new JLabel("NO TELEPON");
		lblNoTelepon.setForeground(Color.WHITE);
		lblNoTelepon.setBounds(10, 367, 82, 14);
		contentPane.add(lblNoTelepon);
		
		textField_7 = new JTextField();
		textField_7.setBounds(10, 381, 238, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JRadioButton rdbtnLakilaki = new JRadioButton("LAKI-LAKI");
		rdbtnLakilaki.setBounds(6, 291, 109, 23);
		contentPane.add(rdbtnLakilaki);
		
		JRadioButton rdbtnPerempuan = new JRadioButton("PEREMPUAN");
		rdbtnPerempuan.setBounds(139, 291, 109, 23);
		contentPane.add(rdbtnPerempuan);
		
		JLabel lblEmail = new JLabel("E-MAIL");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(14, 406, 46, 14);
		contentPane.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 425, 238, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAnggotaSinauAcademy = new JLabel("ANGGOTA SINAU ACADEMY");
		lblAnggotaSinauAcademy.setForeground(new Color(65, 105, 225));
		lblAnggotaSinauAcademy.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
		lblAnggotaSinauAcademy.setBounds(163, 23, 238, 20);
		contentPane.add(lblAnggotaSinauAcademy);
	}
}
