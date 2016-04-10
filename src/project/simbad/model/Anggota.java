package project.simbad.model;

import java.sql.Date;

public class Anggota {

	private static String id_agt;
	private static String nama_agt;
	private static String alamat;
	private static String tempat_lahir;
	private static Date tanggal_lahir;
	private static String jeniskelamin;
	private static String asal_sekolah;
	private static String no_telpn;
	private static String email;

	public static String getId_agt() {
		return id_agt;
	}

	public static void setId_agt(String id_agt) {
		Anggota.id_agt = id_agt;
	}

	public static String getNama_agt() {
		return nama_agt;
	}

	public static void setNama_agt(String nama_agt) {
		Anggota.nama_agt = nama_agt;
	}

	public static String getAlamat() {
		return alamat;
	}

	public static void setAlamat(String alamat) {
		Anggota.alamat = alamat;
	}

	public static String getTempat_lahir() {
		return tempat_lahir;
	}

	public static void setTempat_lahir(String tempat_lahir) {
		Anggota.tempat_lahir = tempat_lahir;
	}

	public static Date getTanggal_lahir() {
		return tanggal_lahir;
	}

	public static void setTanggal_lahir(Date tanggal_lahir) {
		Anggota.tanggal_lahir = tanggal_lahir;
	}

	public static String getJeniskelamin() {
		return jeniskelamin;
	}

	public static void setJeniskelamin(String jeniskelamin) {
		Anggota.jeniskelamin = jeniskelamin;
	}

	public static String getAsal_sekolah() {
		return asal_sekolah;
	}

	public static void setAsal_sekolah(String asal_sekolah) {
		Anggota.asal_sekolah = asal_sekolah;
	}

	public static String getNo_telpn() {
		return no_telpn;
	}

	public static void setNo_telpn(String no_telpn) {
		Anggota.no_telpn = no_telpn;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		Anggota.email = email;
	}

}