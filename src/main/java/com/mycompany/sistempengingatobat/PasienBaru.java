package com.mycompany.sistempengingatobat;

public class PasienBaru extends Pasien {
    private String jenisPerawatan;
    private int lamaPerawatan;

    public PasienBaru(String nama, String nomorPasien, String keluhan, String jenisPerawatan, int lamaPerawatan) {
        super(nama, nomorPasien, keluhan);
        this.jenisPerawatan = jenisPerawatan;
        this.lamaPerawatan = lamaPerawatan;
    }

    public String getJenisPerawatan() {
        return jenisPerawatan;
    }

    public void setJenisPerawatan(String jenisPerawatan) {
        this.jenisPerawatan = jenisPerawatan;
    }

    public int getLamaPerawatan() {
        return lamaPerawatan;
    }

    public void setLamaPerawatan(int lamaPerawatan) {
        this.lamaPerawatan = Math.max(lamaPerawatan, 0);
    }

    @Override
    public String getPeran() {
        return "Pasien Baru";
    }

    @Override
    public void lakukanPengingat() {
        System.out.println("Pengingat awal diberikan kepada pasien baru " + nama + ".");
    }

    public void tampilkanPerawatan() {
        System.out.println("Jenis Perawatan : " + jenisPerawatan);
        System.out.println("Lama Perawatan  : " + lamaPerawatan + " hari");
    }
}
