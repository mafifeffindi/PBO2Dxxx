/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprogram;

/**
 *
 * @author param
 */
import java.util.Scanner;

// 1. Abstraction
abstract class Kendaraan {
    protected String nama;

    Kendaraan(String nama){
        this.nama = nama;
    }

    abstract void jalan();
}

// 2. Inheritance + Super
class Mobil extends Kendaraan {

    Mobil(String nama){
        super(nama);
    }

    @Override
    void jalan(){
        System.out.println(nama + " berjalan di jalan raya");
    }
}

// 3. Polymorphism
class Motor extends Kendaraan {

    Motor(String nama){
        super(nama);
    }

    @Override
    void jalan(){
        System.out.println(nama + " melaju dengan cepat");
    }
}

// 4. Encapsulation
class Pengemudi {
    private String nama;

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
}

// 5. Inner Class
class Garasi {

    class PintuGarasi {
        void buka(){
            System.out.println("Pintu garasi dibuka");
        }
    }
}

// 6. Main Class
public class MainProgram {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pengemudi: ");
        String nama = input.nextLine();

        Pengemudi p = new Pengemudi();
        p.setNama(nama);

        System.out.println("Pengemudi: " + p.getNama());

        Kendaraan k1 = new Mobil("Toyota");
        Kendaraan k2 = new Motor("Honda");

        k1.jalan();
        k2.jalan();

        Garasi g = new Garasi();
        Garasi.PintuGarasi pintu = g.new PintuGarasi();
        pintu.buka();

        input.close();
    }
}