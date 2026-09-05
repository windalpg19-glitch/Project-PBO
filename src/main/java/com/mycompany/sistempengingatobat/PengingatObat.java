

package com.mycompany.sistempengingatobat;

/**
 *
 * @author WINDA
 */
public class PengingatObat {

    // Atribut
    String namaObat;
    String dosis;
    int jam;

    // Constructor
    public PengingatObat(String namaObat, String dosis, int jam) {
        this.namaObat = namaObat;
        this.dosis = dosis;
        this.jam = jam;
    }

    // Method untuk menampilkan data
    public void tampilkanData() {
        
        System.out.println("Nama Obat : " + namaObat);
        System.out.println("Dosis     : " + dosis + " mg");
        System.out.println("Jam Minum : " + jam + ":00");
    }

    public static void main(String[] args) {

        PengingatObat obat1 = new PengingatObat(
                "Paracetamol",
                "500",
                8
        );

        obat1.tampilkanData();
    }
}