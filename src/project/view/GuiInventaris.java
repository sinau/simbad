package project.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

public class GuiInventaris extends JFrame {

	private JPanel contentPane;
	private JTable tableInventaris;
	private JTextField textId;
	private JTextField textNama;
	private JTextField textQtyBaik;
	private JTextField textQtyRusak;
	private JTextField textQtyTotal;
	private JTextField textCari;

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
		setTitle("Inventaris");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel sinauAcademy = new JLabel("");
		Image imageSinauAcademy = new ImageIcon(this.getClass().getResource("/sinauacademy.png")).getImage();
		sinauAcademy.setIcon(new ImageIcon(imageSinauAcademy));
		sinauAcademy.setBounds(128, 11, 317, 80);
		contentPane.add(sinauAcademy);
		
		tableInventaris = new JTable();
		tableInventaris.setBackground(new Color(0, 128, 128));
		tableInventaris.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID Inventaris"
			}
		));
		tableInventaris.setBounds(29, 137, 488, 159);
		contentPane.add(tableInventaris);
		
		JButton buttonShowAll = new JButton("Tampilkan Semua");
		buttonShowAll.setBounds(29, 103, 126, 23);
		contentPane.add(buttonShowAll);
		
		JButton btnAdd = new JButton("Tambah Inventaris");
		btnAdd.setBounds(391, 307, 126, 23);
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(391, 341, 126, 23);
		contentPane.add(btnUpdate);
		
		JButton btnSimpan = new JButton("Simpan");
		btnSimpan.setBounds(225, 481, 126, 23);
		contentPane.add(btnSimpan);
		
		JButton btnHapus = new JButton("Hapus");
		btnHapus.setBounds(225, 515, 126, 23);
		contentPane.add(btnHapus);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(29, 375, 488, 95);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("ID Inventaris");
		label.setForeground(new Color(0, 0, 0));
		label.setBounds(10, 14, 126, 14);
		panel.add(label);
		
		textId = new JTextField();
		textId.setColumns(10);
		textId.setBounds(147, 11, 331, 20);
		panel.add(textId);
		
		JLabel label_1 = new JLabel("Nama");
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setBounds(10, 41, 126, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Quantity");
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setBounds(10, 69, 126, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Baik");
		label_3.setForeground(new Color(0, 0, 0));
		label_3.setBounds(169, 69, 56, 14);
		panel.add(label_3);
		
		textNama = new JTextField();
		textNama.setColumns(10);
		textNama.setBounds(147, 38, 331, 20);
		panel.add(textNama);
		
		textQtyBaik = new JTextField();
		textQtyBaik.setColumns(10);
		textQtyBaik.setBounds(209, 66, 49, 20);
		panel.add(textQtyBaik);
		
		JLabel label_4 = new JLabel("Rusak");
		label_4.setForeground(new Color(0, 0, 0));
		label_4.setBounds(274, 69, 56, 14);
		panel.add(label_4);
		
		textQtyRusak = new JTextField();
		textQtyRusak.setColumns(10);
		textQtyRusak.setBounds(320, 66, 49, 20);
		panel.add(textQtyRusak);
		
		JLabel label_5 = new JLabel("Total");
		label_5.setForeground(new Color(0, 0, 0));
		label_5.setBounds(391, 69, 56, 14);
		panel.add(label_5);
		
		textQtyTotal = new JTextField();
		textQtyTotal.setColumns(10);
		textQtyTotal.setBounds(429, 66, 49, 20);
		panel.add(textQtyTotal);
		
		textCari = new JTextField();
		textCari.setColumns(10);
		textCari.setBounds(29, 307, 175, 20);
		contentPane.add(textCari);
		
		JButton btnCari = new JButton("Cari");
		btnCari.setBounds(216, 307, 68, 23);
		contentPane.add(btnCari);
	}
}
