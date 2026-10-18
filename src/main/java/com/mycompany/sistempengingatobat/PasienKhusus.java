package com.mycompany.sistempengingatobat;

public class PasienKhusus extends Pasien {
    private String kategoriObat;
    private int jumlahKaliMinum;

    public PasienKhusus(String nama, String nomorPasien, String keluhan, String kategoriObat, int jumlahKaliMinum) {
        super(nama, nomorPasien, keluhan);
        this.kategoriObat = kategoriObat;
        setJumlahKaliMinum(jumlahKaliMinum);
    }

    public String getKategoriObat() {
        return kategoriObat;
    }

    public void setKategoriObat(String kategoriObat) {
        this.kategoriObat = kategoriObat;
    }

    public int getJumlahKaliMinum() {
        return jumlahKaliMinum;
    }

    public void setJumlahKaliMinum(int jumlahKaliMinum) {
        this.jumlahKaliMinum = Math.max(jumlahKaliMinum, 0);
    }

    public void tampilkanKategoriObat() {
        System.out.println("Kategori Obat : " + kategoriObat);
        System.out.println("Minum per Hari: " + jumlahKaliMinum + " kali");
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        tampilkanKategoriObat();
    }

    @Override
    public String getPeran() {
        return super.getPeran() + " - Perawatan khusus";
    }
}
