package com.mycompany.sistempengingatobat;

public class SistemPengingatObat {
    public static void main(String[] args) {
        Pasien pasien = new Pasien("Winda", "OBT001", "Demam");
        pasien.tampilkanData();
        pasien.tampilkanKartuObat();
        pasien.lakukanPengingat();

        System.out.println();

        Dokter dokter = new Dokter("Dr. Andi", "Umum");
        JadwalMinum jadwalPagi;
        JadwalMinum jadwalMalam;

        try {
            jadwalPagi = new JadwalMinum("Paracetamol", 8);
            jadwalMalam = new JadwalMinum("Vitamin", 20);
            dokter.tambahJadwal(jadwalPagi);
            dokter.tambahJadwal(jadwalMalam);
            dokter.tampilkanDaftarJadwal();
            dokter.konsultasi(pasien);

            System.out.println();
            dokter.aturPengingat("Amoxicillin", 14, "Minum sesuai petunjuk dokter");
            dokter.aturPengingat("Obat salah", 25);
        } catch (WaktuMinumTidakValidException e) {
            System.out.println("Pengingat gagal dibuat: " + e.getMessage());
        } finally {
            System.out.println("Proses pengaturan pengingat selesai.");
        }

        System.out.println();

        PasienBaru pasienBaru = new PasienBaru("Salsa", "OBT002", "Batuk", "Rawat jalan", 3);
        pasienBaru.tampilkanIdentitas();
        pasienBaru.tampilkanPerawatan();

        System.out.println();

        PasienKhusus pasienKhusus = new PasienKhusus("Rani", "OBT003", "Alergi", "Obat resep", 2);
        pasienKhusus.tampilkanData();

        System.out.println();

        Pengguna[] daftarPengguna = {pasien, dokter, pasienBaru, pasienKhusus};
        for (Pengguna pengguna : daftarPengguna) {
            pengguna.tampilkanIdentitas();
            if (pengguna instanceof Pengingat) {
                ((Pengingat) pengguna).lakukanPengingat();
            }
            System.out.println();
        }
    }
}
