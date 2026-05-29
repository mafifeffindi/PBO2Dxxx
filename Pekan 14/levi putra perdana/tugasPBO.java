class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println();
    }
}

public class tugasPBO {
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa(
                "Levi Putra Perdana",
                "250631100090",
                "Pendidikan Informatika"
        );

        Mahasiswa mhs2 = new Mahasiswa(
                "Moh. Zahri Ramadani",
                "25063110088",
                "Pendidikan Informatika"
        );
        Mahasiswa mhs3 = new Mahasiswa (
                "Fawazuk Haq",
                "250631100078",
                "Pendidikan Informatika");

        System.out.println("~~~Data mahasiswa~~~");
        System.out.println();
        mhs1.tampilData();
        mhs2.tampilData();
        mhs3.tampilData();
    }
}
