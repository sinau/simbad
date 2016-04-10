package project.simbad.model;

public class Inventaris {
	private String id_inventaris;
	private String nama;
	private int qty_total;
	private int qty_baik;
	private int qty_rusak;

	public String getId_inventaris() {
		return id_inventaris;
	}

	public void setId_inventaris(String id_inventaris) {
		this.id_inventaris = id_inventaris;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getQty_total() {
		return qty_total;
	}

	public void setQty_total(int qty_total) {
		this.qty_total = qty_total;
	}

	public int getQty_baik() {
		return qty_baik;
	}

	public void setQty_baik(int qty_baik) {
		this.qty_baik = qty_baik;
	}

	public int getQty_rusak() {
		return qty_rusak;
	}

	public void setQty_rusak(int qty_rusak) {
		this.qty_rusak = qty_rusak;
	}

}
