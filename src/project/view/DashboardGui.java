package project.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class DashboardGui extends JFrame {

	private JPanel contentPane;
	private JMenuItem subMenuAnggotaBaru;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashboardGui frame = new DashboardGui();
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
	public DashboardGui() {
		getContentPane().setBackground(new Color(0, 0, 51));
		setTitle("Sinau Academy Administration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuDaftar = new JMenu("");
		menuDaftar.setToolTipText("Pendaftaran");
		Image imageMenuDaftar = new ImageIcon(this.getClass().getResource("/signup.png")).getImage();
		menuDaftar.setIcon(new ImageIcon(imageMenuDaftar));
		
		menuDaftar.setBackground(SystemColor.desktop);
		menuDaftar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		menuBar.add(menuDaftar);
		
		subMenuAnggotaBaru = new JMenuItem("Anggota baru");
		subMenuAnggotaBaru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DaftarAnggota daftarAnggota = new DaftarAnggota();
				daftarAnggota.show();
			}
		});
		Image imageSubMenuAnggotaBaru = new ImageIcon(this.getClass().getResource("/anggota.png")).getImage();
		subMenuAnggotaBaru.setIcon(new ImageIcon(imageSubMenuAnggotaBaru));
		menuDaftar.add(subMenuAnggotaBaru);
		
		JMenuItem subMenuRegistrasi = new JMenuItem("Registrasi");
		subMenuRegistrasi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrasiGui registrasiGui = new RegistrasiGui();
				registrasiGui.show();
			}
		});
		Image imageSubMenuRegistrasi = new ImageIcon(this.getClass().getResource("/registrasi.png")).getImage();
		subMenuRegistrasi.setIcon(new ImageIcon(imageSubMenuRegistrasi));
		menuDaftar.add(subMenuRegistrasi);
		
		JMenu menuJadwal = new JMenu("");
		menuJadwal.setToolTipText("Jadwal");
		Image imageMenuJadwal = new ImageIcon(this.getClass().getResource("/jadwal.png")).getImage();
		menuJadwal.setIcon(new ImageIcon(imageMenuJadwal));
		menuJadwal.setBackground(SystemColor.desktop);
		menuJadwal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		menuBar.add(menuJadwal);
		
		JMenu menuPembayaran = new JMenu("");
		menuPembayaran.setToolTipText("Pembayaran");
		Image imageMenuPembayaran = new ImageIcon(this.getClass().getResource("/gaji.png")).getImage();
		menuPembayaran.setIcon(new ImageIcon(imageMenuPembayaran));
		menuPembayaran.setBackground(SystemColor.desktop);
		menuPembayaran.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		menuBar.add(menuPembayaran);
		
		JMenuItem menuInventaris = new JMenuItem("");
		menuInventaris.setToolTipText("Inventaris");
		Image imageMntmNewMenuItem = new ImageIcon(this.getClass().getResource("/inventaris.png")).getImage();
		menuInventaris.setIcon(new ImageIcon(imageMntmNewMenuItem));
		menuBar.add(menuInventaris);
		getContentPane().setLayout(null);
		
		JLabel sistemAdministrasi = new JLabel("");
		Image imageSistemAdministrasi = new ImageIcon(this.getClass().getResource("/sistemadministrasi.png")).getImage();
		sistemAdministrasi.setIcon(new ImageIcon(imageSistemAdministrasi));
		sistemAdministrasi.setBounds(392, 285, 267, 32);
		getContentPane().add(sistemAdministrasi);
		
		JLabel sinauAcademy = new JLabel("");
		Image imageSinauAcademy = new ImageIcon(this.getClass().getResource("/sinauacademy.png")).getImage();
		sinauAcademy.setIcon(new ImageIcon(imageSinauAcademy));
		sinauAcademy.setBounds(361, 192, 339, 82);
		getContentPane().add(sinauAcademy);
		
		JLabel simbadProject = new JLabel("");
		Image imageSimbadProject = new ImageIcon(this.getClass().getResource("/simbadproject.png")).getImage();
		simbadProject.setIcon(new ImageIcon(imageSimbadProject));
		simbadProject.setBounds(846, 458, 228, 60);
		getContentPane().add(simbadProject);
		
		
	}
}
