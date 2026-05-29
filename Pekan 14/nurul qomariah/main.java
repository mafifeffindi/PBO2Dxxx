class Mahasiswa {
    // Atribut
    String nama;
    String nim;
    String jurusan;

    // Constructor
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
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Object 1
        Mahasiswa mhs1 = new Mahasiswa(
                "Andawiyatul Badriyah",
                "250101",
                "Ekonomi Pembangunan"
        );

        // Object 2
        Mahasiswa mhs2 = new Mahasiswa(
                "Nurul Qomariyah",
                "250631100094",
                "Pendidikan Informatika"
        );

        // Menampilkan data
        mhs1.tampilData();
        mhs2.tampilData();
    }
}
