
package com.mycompany.sistempengingatobat;

import java.util.ArrayList;
import java.util.List;

public class Dokter extends Pengguna implements Pengingat, PengelolaPengingat {
    private String bidang;
    private final List<JadwalMinum> daftarJadwal;

    public Dokter(String nama, String bidang) {
        super(nama);
        this.bidang = bidang;
        this.daftarJadwal = new ArrayList<>();
    }

    public void tambahJadwal(JadwalMinum jadwal) {
        daftarJadwal.add(jadwal);
    }

    public void tampilkanDaftarJadwal() {
        System.out.println("Daftar jadwal yang dikelola " + nama + ":");
        for (JadwalMinum jadwal : daftarJadwal) {
            jadwal.tampilkanJadwal();
        }
    }

    public void konsultasi(Pasien pasien) {
        System.out.println(nama + " membantu mengatur jadwal obat untuk " + pasien.getNama() + ".");
    }

    @Override
    public String getPeran() {
        return "Dokter bidang " + bidang;
    }

    @Override
    public void lakukanPengingat() {
        System.out.println(nama + " memeriksa jadwal minum obat pasien.");
    }

    @Override
    public void tampilkanJadwal() {
        System.out.println("Jadwal konsultasi " + nama + ": Senin, 08.00 - 10.00 WIB");
    }

    @Override
    public void aturPengingat(String namaObat, int jam) throws WaktuMinumTidakValidException {
        if (jam < 0 || jam > JAM_MAKSIMAL) {
            throw new WaktuMinumTidakValidException("Jam " + jam + " tidak valid. Gunakan jam 0 sampai 23.");
        }
        JadwalMinum jadwal = new JadwalMinum(namaObat, jam);
        tambahJadwal(jadwal);
        System.out.println(nama + " mengatur pengingat untuk " + namaObat + ".");
    }

    public void aturPengingat(String namaObat, int jam, String catatan) throws WaktuMinumTidakValidException {
        aturPengingat(namaObat, jam);
        System.out.println("Catatan: " + catatan);
    }
}
