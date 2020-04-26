package perulangan;

import java.util.Scanner;

public class TugasPerulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Untuk mengimput nilai/data dari user

        System.out.println ("-----|PENJUMLAHAN|-----");
        System.out.print ("Masukkan Angka yang ingin di Jumlahkan = ");
        int angka = input.nextInt();

        for (int i = 1; i <= 10; ++i)
            System.out.println (i+". Hasil dari Penjumlahan "+i+" + "+angka+" = "+(i+angka));

    }
}
