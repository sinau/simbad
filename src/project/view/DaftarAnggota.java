package project.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Panel;
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
import java.awt.Button;

public class DaftarAnggota extends JFrame {

	private JPanel contentPane;
	private JTextField textNama;
	private JTextField textAlamat;
	private JTextField textUniv;
	private JTextField textTelp;
	private JTextField textMail;
	private JTextField textId;
	private JButton buttonSimpan;
	private JTextField textTempatLahir;
	private JTextField textTanggalLahir;
	private JTextField textCari;

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
		super();
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Santoso\\workspace\\ProjectAngkatan2\\pictureicon\\anggota.png"));
		setFont(new Font("Times New Roman", Font.PLAIN, 12));
		setTitle("Daftar Anggota");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 163, 409, 229);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNama = new JLabel("Nama");
		lblNama.setForeground(new Color(0, 0, 0));
		lblNama.setBounds(10, 42, 132, 14);
		panel.add(lblNama);
		
		textNama = new JTextField();
		textNama.setBounds(139, 39, 237, 20);
		panel.add(textNama);
		textNama.setColumns(10);
		
		JLabel label = new JLabel("Alamat");
		label.setForeground(new Color(0, 0, 0));
		label.setBounds(10, 117, 132, 14);
		panel.add(label);
		
		textAlamat = new JTextField();
		textAlamat.setColumns(10);
		textAlamat.setBounds(139, 114, 237, 20);
		panel.add(textAlamat);
		
		JLabel lblAsalUniversitas = new JLabel("Perguruan Tinggi");
		lblAsalUniversitas.setForeground(new Color(0, 0, 0));
		lblAsalUniversitas.setBounds(10, 142, 132, 14);
		panel.add(lblAsalUniversitas);
		
		textUniv = new JTextField();
		textUniv.setColumns(10);
		textUniv.setBounds(139, 139, 237, 20);
		panel.add(textUniv);
		
		JLabel lblNomorHandphone = new JLabel("Telepon");
		lblNomorHandphone.setForeground(new Color(0, 0, 0));
		lblNomorHandphone.setBounds(10, 167, 126, 14);
		panel.add(lblNomorHandphone);
		
		textTelp = new JTextField();
		textTelp.setColumns(10);
		textTelp.setBounds(139, 164, 237, 20);
		panel.add(textTelp);
		
		JLabel lblAlamatEmail = new JLabel("Alamat E-Mail");
		lblAlamatEmail.setForeground(new Color(0, 0, 0));
		lblAlamatEmail.setBounds(10, 192, 126, 14);
		panel.add(lblAlamatEmail);
		
		textMail = new JTextField();
		textMail.setColumns(10);
		textMail.setBounds(139, 189, 237, 20);
		panel.add(textMail);
		
		JLabel lblNomorAnggota = new JLabel("ID Anggota");
		lblNomorAnggota.setForeground(new Color(0, 0, 0));
		lblNomorAnggota.setBounds(10, 17, 132, 14);
		panel.add(lblNomorAnggota);
		
		textId = new JTextField();
		textId.setColumns(10);
		textId.setBounds(139, 14, 237, 20);
		panel.add(textId);
		
		JLabel lblTtl = new JLabel("Tempat Tanggal Lahir");
		lblTtl.setForeground(Color.BLACK);
		lblTtl.setBounds(10, 67, 132, 14);
		panel.add(lblTtl);
		
		textTempatLahir = new JTextField();
		textTempatLahir.setColumns(10);
		textTempatLahir.setBounds(139, 64, 132, 20);
		panel.add(textTempatLahir);
		
		textTanggalLahir = new JTextField();
		textTanggalLahir.setColumns(10);
		textTanggalLahir.setBounds(277, 64, 99, 20);
		panel.add(textTanggalLahir);
		
		JRadioButton rbLakilaki = new JRadioButton("Laki - Laki");
		rbLakilaki.setBounds(139, 88, 109, 23);
		panel.add(rbLakilaki);
		rbLakilaki.setForeground(new Color(0, 0, 0));
		rbLakilaki.setBackground(new Color(0, 128, 128));
		
		JLabel lblAlamat = new JLabel("Jenis Kelamin");
		lblAlamat.setBounds(10, 89, 126, 14);
		panel.add(lblAlamat);
		lblAlamat.setForeground(new Color(0, 0, 0));
		
		JRadioButton rbPerempuan = new JRadioButton("Perempuan");
		rbPerempuan.setBounds(267, 88, 109, 23);
		panel.add(rbPerempuan);
		rbPerempuan.setForeground(new Color(0, 0, 0));
		rbPerempuan.setBackground(new Color(0, 128, 128));
		
		buttonSimpan = new JButton("Simpan");
		buttonSimpan.setBounds(183, 403, 89, 23);
		contentPane.add(buttonSimpan);
		
		JLabel sinauAcademy = new JLabel("");
		Image imageSinauAcademy = new ImageIcon(this.getClass().getResource("/sinauacademy.png")).getImage();
		sinauAcademy.setIcon(new ImageIcon(imageSinauAcademy));
		sinauAcademy.setBounds(42, 8, 327, 93);
		contentPane.add(sinauAcademy);
		
		textCari = new JTextField();
		textCari.setColumns(10);
		textCari.setBounds(10, 107, 203, 20);
		contentPane.add(textCari);
		
	}
}
