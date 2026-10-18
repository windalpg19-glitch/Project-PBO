package com.mycompany.sistempengingatobat;

public abstract class Pengguna {
    protected String nama;

    public Pengguna(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract String getPeran();

    public void tampilkanIdentitas() {
        System.out.println("Nama : " + nama);
        System.out.println("Peran : " + getPeran());
    }
}
