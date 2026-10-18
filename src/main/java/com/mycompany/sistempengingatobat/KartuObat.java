package com.mycompany.sistempengingatobat;

public class KartuObat {
    private String nomorKartu;

    public KartuObat(String nomorKartu) {
        this.nomorKartu = nomorKartu;
        System.out.println("Kartu obat dengan nomor " + nomorKartu + " dibuat.");
    }

    public String getNomorKartu() {
        return nomorKartu;
    }

    public void tampilkanKartu() {
        System.out.println("Kartu Pengingat Obat");
        System.out.println("Nomor: " + nomorKartu);
    }
}

