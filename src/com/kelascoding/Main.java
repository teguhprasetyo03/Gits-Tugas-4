package com.kelascoding;

public class Main {

    public static void main(String[] args) {

        //Mendeklarasikan myArray
        Segitiga segitiga[];
        //Membuat myArray
        segitiga = Segitiga.buatArraySegitiga();
        //Menampilkan myArray dan rata-rata luas
        Segitiga.printArraySegitiga(segitiga);
    }
}
