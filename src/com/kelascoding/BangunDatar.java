package com.kelascoding;

import java.util.Scanner;

public class BangunDatar {

    public BangunDatar(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float getAlas() {
        return alas;
    }

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    private float alas;
    private float tinggi;
    static Scanner input = new Scanner(System.in);



    //Membuat array dari objek segitiga
    public static Segitiga [] buatArraySegitiga(){
        System.out.print("Berapa objek segitiga akan di buat ? ");
        int jumlahObjek = input.nextInt();
        System.out.println("==================================================");
        Segitiga arraySegitiga [] = new Segitiga [jumlahObjek];
        for (int i = 0; i < arraySegitiga.length; i++){
            System.out.print("Masukkan nilai alas untuk " + "Segitiga ke " + (i + 1) + ": ");
            float nilaiPanjang = input.nextFloat();
            System.out.print("Masukkan nilai tinggi untuk " + "Segitiga ke " + (i + 1) + ": ");
            float nilaiLebar = input.nextFloat();
            System.out.println("----------------------------------------------------------");
            arraySegitiga[i] = new Segitiga(nilaiPanjang, nilaiLebar);
        }
        return arraySegitiga;
    }

    //Menampilkan alas, tinggi dan luas untuk setiap objek segitiga
    public static void printArraySegitiga(Segitiga arraySegitiga []){
        System.out.printf("%-20s%-15s%-10s\n", "Panjang", "Lebar", "Luas");
        for(int i = 0; i < arraySegitiga.length; i++){
            double luas = 0.5 * arraySegitiga [i].getAlas() * arraySegitiga[i].getTinggi();
            System.out.printf("%-20f%-15f%-10f\n", arraySegitiga[i].getAlas(), arraySegitiga[i].getTinggi(), luas);
        }

        System.out.println("=====================================================");
        System.out.printf("%-20s%-10f\n", "Rata-rata luas segitiga adalah ",
                averageLuas(arraySegitiga));
    }

    //Menghitung rata-rata luas segitiga
    public static double averageLuas(Segitiga arraySegitiga[]) {
        double jumlahLuas = 0;
        for (int i =0; i < arraySegitiga.length; i++) {
            jumlahLuas += (arraySegitiga[i].getAlas() * arraySegitiga[i].getTinggi());
        } return jumlahLuas / arraySegitiga.length;

    }
}
