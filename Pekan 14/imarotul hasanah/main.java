public class Mahasiswa {
    String Nama;
    String NIM;
    String Jurusan;
    
Mahasiswa(String Nama, String NIM, String Jurusan) {
    this.Nama = Nama;
    this.NIM = NIM;
    this.Jurusan = Jurusan;
} 
void tampilData() {
    System.out.println("Nama    : " + Nama);
    System.out.println("NIM       " + NIM);
    System.out.println("Jurusan   " + Jurusan);
}
public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa(
            "Imaa",
            "250631100097",
            "Pendidikan Informatika"
    );
    
    Mahasiswa mhs2 = new Mahasiswa(
            "Dea",
            "250431100067",
            "Sosiologi"
    );
    mhs1.tampilData();
    mhs2.tampilData();
}
    }
