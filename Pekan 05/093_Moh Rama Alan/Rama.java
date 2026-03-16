abstract class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }
    abstract void suara();
}
class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }
    @Override
    void suara() {
        System.out.println(nama + " bersuara: Meong");
    }
}
class Orang {
    private String nama;
    private int umur;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    class Alamat {
        private String kota;

        public void setKota(String kota) {
            this.kota = kota;
        }

        void tampilAlamat() {
            System.out.println("Kota: " + kota);
        }
    }
}

public class MainProgram {
    public static void main(String[] args) {

        Orang orang1 = new Orang();
        orang1.setNama("Rama Alan");
        orang1.setUmur(20);

        System.out.println("Nama: " + orang1.getNama());
        System.out.println("Umur: " + orang1.getUmur());

        Orang.Alamat alamat = orang1.new Alamat();
        alamat.setKota("Sumenep");
        alamat.tampilAlamat();

        Hewan kucing1 = new Kucing("Kitty");
        kucing1.suara();
    }
}
