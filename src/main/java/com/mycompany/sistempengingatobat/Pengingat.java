package com.mycompany.sistempengingatobat;

public interface Pengingat {
    void lakukanPengingat();

    default void tampilkanJadwal() {
        System.out.println("Jadwal minum obat belum ditentukan.");
    }
}
