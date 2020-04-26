package perulangan;

public class For {
    package perulangan;

    public class Main {
        public static void main(String[] args) {
            int isiGelas = 0;
            int penuh = 225;

            System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
            System.out.println("Isi Gelas Ketika Penuh : " + penuh + "ml");


            for (isiGelas = 225; isiGelas <= penuh; isiGelas++){
                System.out.println("Sedang mengisi gelas..");
                System.out.println("Isi Gelas Sekarang : " + isiGelas + "ml");
            }

            System.out.println("Finale : Isi Gelas Sekarang : " + isiGelas + "ml");
        }

    }

}
