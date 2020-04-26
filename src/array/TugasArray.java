package array;

import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TugasArray {
    public static void main(String[] args) {

        // membuat array Nama Mahasiswa
        String[] nama = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for (int i = 0; i < nama.length; i++){
            System.out.print("Nama Ke- " + i + ":");
            nama[i] = scan.nextLine();
        }

        System.out.println("------------------------------");

        // menampilkan semua isi array
        for (String h : nama) {
            System.out.println(h);
        }
    }
}
