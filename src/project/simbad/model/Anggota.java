package project.simbad.model;

import java.util.Date;

public class Anggota {
	private String idAgt;
	private String namaAgt;
	private String alamat;
	private String tempatLahir;
	private Date tanggalLahir;
	private String jenisKelamin;
	private String asalSekolah;
	private String noTelp;
	private String email;
	public String getIdAgt() {
		return idAgt;
	}
	public void setIdAgt(String idAgt) {
		this.idAgt = idAgt;
	}
	public String getNamaAgt() {
		return namaAgt;
	}
	public void setNamaAgt(String namaAgt) {
		this.namaAgt = namaAgt;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getTempatLahir() {
		return tempatLahir;
	}
	public void setTempatLahir(String tempatLahir) {
		this.tempatLahir = tempatLahir;
	}
	public Date getTanggalLahir() {
		return tanggalLahir;
	}
	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	public String getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getAsalSekolah() {
		return asalSekolah;
	}
	public void setAsalSekolah(String asalSekolah) {
		this.asalSekolah = asalSekolah;
	}
	public String getNoTelp() {
		return noTelp;
	}
	public void setNoTelp(String noTelp) {
		this.noTelp = noTelp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
