package com.mycompany.sistempengingatobat;

public class SistemPengingatObat {

    String namaObat;
    String dosis;
    int jamMinum;

    // Constructor
    public SistemPengingatObat(String namaObat, String dosis, int jamMinum) {
        this.namaObat = namaObat;
        this.dosis = dosis;
        this.jamMinum = jamMinum;
    }

    // Menampilkan data obat
    public void tampilkanData() {
        
        System.out.println("Nama Obat : " + namaObat);
        System.out.println("Dosis     : " + dosis + " mg");
        System.out.println("Jam Minum : " + jamMinum + ":00");
    }

    public static void main(String[] args) {

        SistemPengingatObat obat1 =
                new SistemPengingatObat(
                        "Paracetamol",
                        "500",
                        8
                );

        obat1.tampilkanData();
    }
}