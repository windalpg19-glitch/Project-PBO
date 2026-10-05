package com.mycompany.sistempengingatobat;

public class SistemPengingatObat {

    public static void main(String[] args) {

        System.out.println("DATA OBAT RESEP ");

        ObatResep obat1 = new ObatResep(
                "Amoxicillin",
                "500",
                14,
                "dr. Budi",
                5
        );

        obat1.tampilkanData();
        obat1.lakukanPengingat();
        obat1.tampilkanPesan();

        System.out.println("\nDATA OBAT BIASA ");

        ObatBiasa obat2 = new ObatBiasa(
                "Paracetamol",
                "500",
                8,
                "Untuk menurunkan demam"
        );

        obat2.tampilkanData();
        obat2.lakukanPengingat();

        System.out.println("\nDATA OBAT HERBAL ");

        ObatHerbal obat3 = new ObatHerbal(
                "Tolak Angin",
                "1 sachet",
                20,
                "Jahe"
        );

        obat3.tampilkanData();
        obat3.lakukanPengingat();

        System.out.println("\n POLYMORPHISM ");

        PengingatObat obat4 = new ObatResep(
                "Ibuprofen",
                "400",
                20,
                "dr. Sari",
                3
        );

        obat4.tampilkanData();

        System.out.println("\n VALIDASI ");

        ObatResep obat5 = new ObatResep(
                "",
                "",
                25,
                "",
                -3
        );

        obat5.tampilkanData();

        System.out.println("\n OVERLOADING ");

        obat1.tampilkanData("Obat harus diminum sesuai resep dokter.");

        System.out.println("\n UPDATE DATA ");

        obat1.setNamaObat("Amoxicillin 500");
        obat1.setDosis("500");
        obat1.setJamMinum(16);
        obat1.setNamaDokter("dr. Andi");

        System.out.println("Nama Obat : " + obat1.getNamaObat());
        System.out.println("Dosis     : " + obat1.getDosis() + " mg");
        System.out.println("Jam Minum : " + obat1.getJamMinum() + ":00 WIB");
        System.out.println("Dokter    : " + obat1.getNamaDokter());
    }
}