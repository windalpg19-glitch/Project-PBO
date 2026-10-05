
package com.mycompany.sistempengingatobat;

public interface Pengingat {
    void lakukanPengingat();

    default void tampilkanPesan() {
        System.out.println("Jangan lupa minum obat tepat waktu.");
    }
}