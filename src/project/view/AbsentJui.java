package project.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;

public class AbsentJui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbsentJui frame = new AbsentJui();
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
	public AbsentJui() {
		setForeground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 381);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(177, 90, 170, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(358, 94, 54, 23);
		contentPane.add(btnOk);
		
		JLabel lblMasukanNik = new JLabel("MASUKAN NIK");
		lblMasukanNik.setBounds(59, 98, 75, 14);
		contentPane.add(lblMasukanNik);
		
		JLabel lblNama = new JLabel("NAMA");
		lblNama.setBounds(10, 199, 46, 14);
		contentPane.add(lblNama);
		
		JLabel lblJam = new JLabel("JAM");
		lblJam.setBounds(10, 241, 46, 14);
		contentPane.add(lblJam);
		
		JLabel lblStatus = new JLabel("STATUS");
		lblStatus.setBounds(10, 280, 46, 14);
		contentPane.add(lblStatus);
		
		JPanel panel = new JPanel();
		panel.setBounds(101, 173, 323, 63);
		contentPane.add(panel);
		
		JLabel lblNikSalahMasukan = new JLabel("NIK SALAH MASUKAN KEMBALI \r\nATAU KLIK CARI");
		panel.add(lblNikSalahMasukan);
		
		JButton btnCari = new JButton("CARI");
		panel.add(btnCari);
		
		JLabel lblNewLabel = new JLabel("ABSENSI");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Snap ITC", Font.BOLD, 22));
		lblNewLabel.setBounds(158, 11, 153, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SINAU ACADEMY");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Square721 Cn BT", Font.BOLD, 20));
		lblNewLabel_1.setBounds(195, 31, 196, 31);
		contentPane.add(lblNewLabel_1);
	}
}
