import java.util.Scanner;

class Mahasiswa {
    // Atribut untuk menyimpan data
    String nama;
    String nim;
    String jurusan;

    // Constructor untuk memanggil data
    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method tampilData()
    void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        // Membuat object
        Mahasiswa mhs1 = new Mahasiswa("Tiara", "259631100081", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("ara", "081", "Pendidikan Informasi");

        // Menampilkan data
        mhs1.tampilData();
        mhs2.tampilData();
    }
}
