/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistempengingatobat;

/**
 *
 * @author WINDA
 */
public class ObatResep extends PengingatObat {
    private String namaDokter;
    private int lamaHari;

    public ObatResep(String namaObat, String dosis, int jamMinum,
                     String namaDokter, int lamaHari) {
        super(namaObat, dosis, jamMinum);   // panggil constructor parent
        this.namaDokter = namaDokter;
        this.lamaHari = lamaHari;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
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
    public void tampilkanData() {
        super.tampilkanData();              // pakai output parent dulu
        System.out.println("Dokter    : " + namaDokter);
        System.out.println("Lama      : " + lamaHari + " hari");
    }
}