package com.mycompany.sistempengingatobat;

public class JadwalMinum {
    private String namaObat;
    private int jam;

    public JadwalMinum(String namaObat, int jam) throws WaktuMinumTidakValidException {
        this.namaObat = namaObat;
        setJam(jam);
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        if (namaObat == null || namaObat.trim().isEmpty()) {
            this.namaObat = "Obat tanpa nama";
        } else {
            this.namaObat = namaObat;
        }
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) throws WaktuMinumTidakValidException {
        if (jam < 0 || jam > 23) {
            throw new WaktuMinumTidakValidException("Jam harus di antara 0 sampai 23.");
        }
        this.jam = jam;
    }

    public void tampilkanJadwal() {
        System.out.printf("Obat: %s, Jam minum: %02d.00 WIB%n", namaObat, jam);
    }
}
