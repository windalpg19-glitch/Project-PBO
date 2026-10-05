
package com.mycompany.sistempengingatobat;

public class ObatBiasa extends PengingatObat {
    private String jenisPenggunaan;

    public ObatBiasa(String namaObat, String dosis, int jamMinum,
                     String jenisPenggunaan) {
        super(namaObat, dosis, jamMinum);
        this.jenisPenggunaan = jenisPenggunaan;
    }

    public String getJenisPenggunaan() {
        return jenisPenggunaan;
    }

    public void setJenisPenggunaan(String jenisPenggunaan) {
        this.jenisPenggunaan = jenisPenggunaan;
    }

    @Override
    public String getJenisObat() {
        return "Obat Biasa";
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis       : " + getJenisObat());
        System.out.println("Penggunaan  : " + jenisPenggunaan);
    }

    @Override
    public void lakukanPengingat() {
        System.out.println("Pengingat: Saatnya minum obat biasa " + getNamaObat());
    }
}
