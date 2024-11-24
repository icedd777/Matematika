/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Risat
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mtkCanggih = new MatematikaCanggih();

        System.out.println("Tambah: " + mtkCanggih.tambah(20, 20));
        System.out.println("Kurang: " + mtkCanggih.kurang(75, 35));
        System.out.println("Kali: " + mtkCanggih.kali(98, 21));
        System.out.println("Bagi: " + mtkCanggih.bagi(172, 60));
        System.out.println("Modulus: " + mtkCanggih.modulus(57, 4));
        System.out.println("Kombinasi (Tambah + Kali): " + mtkCanggih.kombinasiTambahKali(53, 25, 200));
    }
}

