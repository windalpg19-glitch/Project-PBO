package com.mycompany.sistempengingatobat;

public class SistemPengingatObat {

    public static void main(String[] args) {

   System.out.println(" UJI COBA 1: DATA VALID ");
        
    PengingatObat obat1 = new PengingatObat("Paracetamol", "500", 8);
    obat1.tampilkanData();

      System.out.println("\n UJI COBA 2: VALIDASI INPUT SALAH ");
        
     PengingatObat obat2 = new PengingatObat("", "", 25);
     obat2.tampilkanData();

    System.out.println("\n UPDATE SETTER & GETTER ");
        
        obat2.setNamaObat("Amoxicillin");
        obat2.setDosis("500");
        obat2.setJamMinum(14);

        
        System.out.println("Nama Obat  : " + obat2.getNamaObat());
     System.out.println("Dosis     : " + obat2.getDosis() + " mg");
        System.out.println("Jam Minum  : " + obat2.getJamMinum() + ":00 WIB");
    }
}