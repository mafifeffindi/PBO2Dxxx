* @author Noor Fathiatul Alea
 */
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    
    Mahasiswa(String nama, String NIM, String jurusan){
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }
    void tampilData(){
        System.out.println("Nama        : " +nama);
        System.out.println("NIM         : " +NIM);
        System.out.println("Jurusan     : " +jurusan);
    }
}
public class main{
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Thiya","250631100082","Pendidikan Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Rina","250631100089","sosiologi");
        
        mhs1.tampilData();
        mhs2.tampilData();
    }
}
