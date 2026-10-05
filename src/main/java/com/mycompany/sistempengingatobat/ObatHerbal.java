package com.mycompany.sistempengingatobat;

public class ObatHerbal extends PengingatObat {
    private String bahanUtama;

    public ObatHerbal(String namaObat, String dosis, int jamMinum,
                      String bahanUtama) {
        super(namaObat, dosis, jamMinum);
        this.bahanUtama = bahanUtama;
    }

    public String getBahanUtama() {
        return bahanUtama;
    }

    public void setBahanUtama(String bahanUtama) {
        this.bahanUtama = bahanUtama;
    }

    @Override
    public String getJenisObat() {
        return "Obat Herbal";
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis       : " + getJenisObat());
        System.out.println("Bahan Utama : " + bahanUtama);
    }

    @Override
    public void lakukanPengingat() {
        System.out.println("Pengingat: Saatnya minum obat herbal " + getNamaObat());
    }
}
