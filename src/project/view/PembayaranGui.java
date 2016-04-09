package project.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class PembayaranGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblNama;
	private JTextField textNama;
	private JLabel lblTotalBayar;
	private JTextField textTotalBayar;
	private JLabel lblTerbayar;
	private JTextField textTerbayar;
	private JTextField textSisa;
	private JLabel lblSisa;
	private JPanel panel_1;
	private JLabel lblBayar;
	private JTextField textPelunasan;
	private JLabel lblSisa_1;
	private JTextField textSisaPelunasan;
	private Button button_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PembayaranGui frame = new PembayaranGui();
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
	public PembayaranGui() {
		setTitle("Pembayaran");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 487);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel sinauAcademy = new JLabel("");
		Image imageSinauAcademy = new ImageIcon(this.getClass().getResource("/sinauacademy.png")).getImage();
		sinauAcademy.setIcon(new ImageIcon(imageSinauAcademy));
		sinauAcademy.setBounds(89, 11, 321, 93);
		contentPane.add(sinauAcademy);
		
		Button button = new Button("Cari");
		button.setBounds(428, 138, 70, 22);
		contentPane.add(button);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 140, 412, 20);
		contentPane.add(textField_1);
		
		Button button_1 = new Button("Pelunasan");
		button_1.setBounds(428, 301, 70, 22);
		contentPane.add(button_1);
		
		lblNewLabel = new JLabel("Masukan ID Pembayaran");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 115, 124, 14);
		contentPane.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(10, 168, 488, 127);
		contentPane.add(panel);
		
		lblNama = new JLabel("Nama");
		lblNama.setForeground(Color.BLACK);
		lblNama.setBounds(10, 14, 126, 14);
		panel.add(lblNama);
		
		textNama = new JTextField();
		textNama.setColumns(10);
		textNama.setBounds(147, 11, 331, 20);
		panel.add(textNama);
		
		lblTotalBayar = new JLabel("Total bayar");
		lblTotalBayar.setForeground(Color.BLACK);
		lblTotalBayar.setBounds(10, 41, 126, 14);
		panel.add(lblTotalBayar);
		
		textTotalBayar = new JTextField();
		textTotalBayar.setColumns(10);
		textTotalBayar.setBounds(147, 38, 331, 20);
		panel.add(textTotalBayar);
		
		lblTerbayar = new JLabel("Terbayar");
		lblTerbayar.setForeground(Color.BLACK);
		lblTerbayar.setBounds(10, 69, 126, 14);
		panel.add(lblTerbayar);
		
		textTerbayar = new JTextField();
		textTerbayar.setColumns(10);
		textTerbayar.setBounds(147, 66, 331, 20);
		panel.add(textTerbayar);
		
		textSisa = new JTextField();
		textSisa.setColumns(10);
		textSisa.setBounds(147, 94, 331, 20);
		panel.add(textSisa);
		
		lblSisa = new JLabel("Sisa");
		lblSisa.setForeground(Color.BLACK);
		lblSisa.setBounds(10, 97, 126, 14);
		panel.add(lblSisa);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setBounds(10, 329, 488, 72);
		contentPane.add(panel_1);
		
		lblBayar = new JLabel("Bayar");
		lblBayar.setForeground(Color.BLACK);
		lblBayar.setBounds(10, 14, 126, 14);
		panel_1.add(lblBayar);
		
		textPelunasan = new JTextField();
		textPelunasan.setColumns(10);
		textPelunasan.setBounds(147, 11, 331, 20);
		panel_1.add(textPelunasan);
		
		lblSisa_1 = new JLabel("Sisa");
		lblSisa_1.setForeground(Color.BLACK);
		lblSisa_1.setBounds(10, 42, 126, 14);
		panel_1.add(lblSisa_1);
		
		textSisaPelunasan = new JTextField();
		textSisaPelunasan.setColumns(10);
		textSisaPelunasan.setBounds(147, 39, 331, 20);
		panel_1.add(textSisaPelunasan);
		
		button_2 = new Button("Simpan");
		button_2.setBounds(233, 417, 70, 22);
		contentPane.add(button_2);
	}

}
