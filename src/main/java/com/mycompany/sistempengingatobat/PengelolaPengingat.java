package com.mycompany.sistempengingatobat;

public interface PengelolaPengingat {
    int JAM_MAKSIMAL = 23;

    void aturPengingat(String namaObat, int jam) throws WaktuMinumTidakValidException;
}
