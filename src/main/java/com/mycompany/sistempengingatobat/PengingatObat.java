package com.mycompany.sistempengingatobat;

public abstract class PengingatObat implements Pengingat {
    private String namaObat;
    private String dosis;
    private int jamMinum;

    public PengingatObat(String namaObat, String dosis, int jamMinum) {
        setNamaObat(namaObat);
        setDosis(dosis);
        setJamMinum(jamMinum);
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        if (namaObat != null && !namaObat.trim().isEmpty()) {
            this.namaObat = namaObat;
        } else {
            System.out.println("[Error] Nama obat tidak boleh kosong!");
            this.namaObat = "Tanpa Nama";
        }
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        if (dosis != null && !dosis.trim().isEmpty()) {
            this.dosis = dosis;
        } else {
            System.out.println("[Error] Dosis tidak boleh kosong!");
            this.dosis = "0";
        }
    }

    public int getJamMinum() {
        return jamMinum;
    }

    public void setJamMinum(int jamMinum) {
        if (jamMinum >= 0 && jamMinum <= 23) {
            this.jamMinum = jamMinum;
        } else {
            System.out.println("[Error] Jam minum harus antara 0 - 23!");
            this.jamMinum = 0;
        }
    }

    public void tampilkanData() {
        System.out.println("Nama Obat : " + namaObat);
        System.out.println("Dosis     : " + dosis + " mg");
        System.out.printf("Jam Minum : %02d:00 WIB\n", jamMinum);
    }

    public abstract String getJenisObat();
}