package project.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PembayaranGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 415);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(160, 82, 45));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PEMBAYARAN\r\n");
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 20));
		lblNewLabel.setBounds(193, 2, 294, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblSinauAcademy = new JLabel("SINAU ACADEMY");
		lblSinauAcademy.setFont(new Font("Stencil", Font.BOLD, 16));
		lblSinauAcademy.setBounds(193, 34, 154, 17);
		contentPane.add(lblSinauAcademy);
		
		JLabel lblMasukanNik = new JLabel("MASUKAN NIK");
		lblMasukanNik.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMasukanNik.setForeground(new Color(230, 230, 250));
		lblMasukanNik.setBounds(25, 70, 112, 49);
		contentPane.add(lblMasukanNik);
		
		textField = new JTextField();
		textField.setBounds(158, 77, 237, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(62, 130, 185, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNama = new JLabel("NAMA");
		lblNama.setBounds(25, 133, 46, 14);
		contentPane.add(lblNama);
		
		JLabel lblNewLabel_1 = new JLabel("ANGKATAN");
		lblNewLabel_1.setBounds(265, 133, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(327, 130, 46, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(74, 205, 288, 61);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblRp = new JLabel("Rp");
		lblRp.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblRp.setBounds(25, 176, 76, 101);
		contentPane.add(lblRp);
		
		JButton btnNewButton = new JButton("BAYAR");
		btnNewButton.setBounds(349, 312, 138, 31);
		contentPane.add(btnNewButton);
	}
}
