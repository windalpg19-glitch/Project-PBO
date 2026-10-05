package com.mycompany.sistempengingatobat;

public class ObatResep extends PengingatObat {
    private String namaDokter;
    private int lamaHari;

    public ObatResep(String namaObat, String dosis, int jamMinum,
                     String namaDokter, int lamaHari) {
        super(namaObat, dosis, jamMinum);
        setNamaDokter(namaDokter);
        setLamaHari(lamaHari);
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        if (namaDokter != null && !namaDokter.trim().isEmpty()) {
            this.namaDokter = namaDokter;
        } else {
            this.namaDokter = "Tidak diketahui";
        }
    }

    public int getLamaHari() {
        return lamaHari;
    }

    public void setLamaHari(int lamaHari) {
        if (lamaHari > 0) {
            this.lamaHari = lamaHari;
        } else {
            System.out.println("[Error] Lama minum harus lebih dari 0 hari!");
            this.lamaHari = 1;
        }
    }

    @Override
    public String getJenisObat() {
        return "Obat Resep";
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Jenis      : " + getJenisObat());
        System.out.println("Dokter     : " + namaDokter);
        System.out.println("Lama       : " + lamaHari + " hari");
    }

    @Override
    public void lakukanPengingat() {
        System.out.println("Pengingat: Saatnya minum obat resep " + getNamaObat());
    }

    public void tampilkanData(String keterangan) {
        tampilkanData();
        System.out.println("Keterangan : " + keterangan);
    }
}