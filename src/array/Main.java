package array;

public class Main {
    public static void main(String[] args) {
        String mataKuliah[];
        mataKuliah = new String[10];

        mataKuliah[0] = "PBO 1";
        mataKuliah[1] = "Visual 2";
        mataKuliah[2] = "Jarkom 2";
        mataKuliah[3] = "WEB 2";
        mataKuliah[4] = "Sistem Terdistribusi";

        System.out.println(mataKuliah.length); //jumlah/panjang array
        System.out.println(mataKuliah[0]); //index pertama
        System.out.println(mataKuliah[4]); // index terakhir
    }
}
