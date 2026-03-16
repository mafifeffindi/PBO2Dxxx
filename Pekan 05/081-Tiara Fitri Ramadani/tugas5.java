/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication85;
import java.util.Scanner;

/**
 *
 * @author UsEr
 */
public class JavaApplication85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

// ================= ABSTRACTION =================
abstract class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    abstract void suara();
}

// ================= INHERITANCE + SUPER + POLYMORPHISM =================
class Kucing extends Hewan {

    public Kucing(String nama) {
        super(nama); // penggunaan super
    }

    @Override
    void suara() { // polymorphism
        System.out.println(nama + " bersuara: Meong...");
    }
}

// ================= ENCAPSULATION =================
class Mahasiswa {
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
}

// ================= INNER CLASS =================
class Kampus {

    class Jurusan {
        void tampilJurusan() {
            System.out.println("Jurusan : Informatika");
        }
    }
}

// ================= MAIN PROGRAM =================
    

        Scanner input = new Scanner(System.in);

        // Encapsulation
        Mahasiswa mhs = new Mahasiswa();

        System.out.print("Masukkan Nama Mahasiswa : ");
        mhs.setNama(input.nextLine());

        System.out.print("Masukkan Umur Mahasiswa : ");
        mhs.setUmur(input.nextInt());

        System.out.println("\nData Mahasiswa");
        System.out.println("Nama : " + mhs.getNama());
        System.out.println("Umur : " + mhs.getUmur());

        // Inheritance + Polymorphism
        Kucing k = new Kucing("Kitty");
        k.suara();

        // Inner Class
        Kampus kampus = new Kampus();
        Kampus.Jurusan jur = kampus.new Jurusan();
        jur.tampilJurusan();
    }
}
        // TODO code application logic here
