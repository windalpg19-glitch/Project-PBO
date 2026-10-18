package com.mycompany.sistempengingatobat;

public class Pasien extends Pengguna implements Pengingat {
    protected String nomorPasien;
    protected String keluhan;
    private final KartuObat kartuObat;

    public Pasien(String nama, String nomorPasien, String keluhan) {
        super(nama);
        this.nomorPasien = nomorPasien;
        this.keluhan = keluhan;
        this.kartuObat = new KartuObat(nomorPasien);
    }

    public String getNomorPasien() {
        return nomorPasien;
    }

    public void setNomorPasien(String nomorPasien) {
        this.nomorPasien = nomorPasien;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public void tampilkanKartuObat() {
        kartuObat.tampilkanKartu();
    }

    public void tampilkanData() {
        System.out.println("Nama Pasien : " + nama);
        System.out.println("Nomor Pasien: " + nomorPasien);
        System.out.println("Keluhan     : " + keluhan);
    }

    public void minumObat() {
        System.out.println(nama + " sedang minum obat sesuai jadwal.");
    }

    @Override
    public String getPeran() {
        return "Pasien";
    }

    @Override
    public void lakukanPengingat() {
        System.out.println("Pengingat obat aktif untuk " + nama + ".");
    }
}
