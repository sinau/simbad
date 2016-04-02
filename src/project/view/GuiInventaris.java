package project.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GuiInventaris extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiInventaris frame = new GuiInventaris();
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
	public GuiInventaris() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInventaris = new JLabel("INVENTARIS");
		lblInventaris.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblInventaris.setBounds(213, 11, 144, 30);
		contentPane.add(lblInventaris);
		
		JLabel lblSinauAcademy = new JLabel("SINAU ACADEMY");
		lblSinauAcademy.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		lblSinauAcademy.setBounds(200, 38, 169, 30);
		contentPane.add(lblSinauAcademy);
		
		textField = new JTextField();
		textField.setBounds(124, 79, 233, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 120, 233, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(124, 161, 233, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(124, 201, 233, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(124, 248, 233, 30);
		contentPane.add(textField_4);
		
		JLabel lblIdBarang = new JLabel("ID BARANG");
		lblIdBarang.setBounds(10, 76, 100, 33);
		contentPane.add(lblIdBarang);
		
		JLabel lblNamaBarang = new JLabel("NAMA BARANG\r\n");
		lblNamaBarang.setBounds(10, 117, 100, 33);
		contentPane.add(lblNamaBarang);
		
		JLabel lblQualityBarang = new JLabel("QUALITY TOTAL");
		lblQualityBarang.setBounds(10, 161, 100, 33);
		contentPane.add(lblQualityBarang);
		
		JLabel lblQualityBaik = new JLabel("QUALITY BAIK");
		lblQualityBaik.setBounds(10, 200, 100, 33);
		contentPane.add(lblQualityBaik);
		
		JLabel lblQualityBuruk = new JLabel("QUALITY RUSAK");
		lblQualityBuruk.setBounds(10, 248, 100, 33);
		contentPane.add(lblQualityBuruk);
		
		JButton btnSimpan = new JButton("SIMPAN");
		btnSimpan.setBounds(365, 299, 106, 30);
		contentPane.add(btnSimpan);
	}
}
