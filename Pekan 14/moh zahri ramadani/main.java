public class MahasiswaPIF {

    static class Mahasiswa {
        //Atr
        String nama;
        String nim;
        String jurusan;

        //Constr
        public Mahasiswa(String nama, String nim, String jurusan) {
            this.nama = nama;
            this.nim = nim;
            this.jurusan = jurusan;
        }

        //Method
        public void tampilData() {
            System.out.println("+--------------------------------------------+");
            System.out.printf("| [Nama]    : %-30s |\n", this.nama);
            System.out.printf("| [NIM]     : %-30s |\n", this.nim);
            System.out.printf("| [Jurusan] : %-30s |\n", this.jurusan);
            System.out.println("+--------------------------------------------+");
        }
    }

    // Mainmethod 
    public static void main(String[] args) {
     
        System.out.println("+============================================+");
        System.out.println("|DATA MAHASISWA PRODI PENDIDIKAN INFORMATIKA |");
        System.out.println("+============================================+");

        Mahasiswa mhs1 = new Mahasiswa("Zahri Ramadani", "250411100088", "Pendidikan Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Muhammad Zahri", "250411100089", "Pendidikan Informatika");

        // Mangmeth
        System.out.println("\n Mahasiswa 1:");
        mhs1.tampilData();

        System.out.println("\n Mahasiswa 2:");
        mhs2.tampilData();
    }
}
