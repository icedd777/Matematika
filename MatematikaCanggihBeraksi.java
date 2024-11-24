/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angga
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mtkCanggih = new MatematikaCanggih();

        System.out.println("Tambah: " + mtkCanggih.tambah(30, 20));
        System.out.println("Kurang: " + mtkCanggih.kurang(65, 25));
        System.out.println("Kali: " + mtkCanggih.kali(78, 31));
        System.out.println("Bagi: " + mtkCanggih.bagi(120, 20));
        System.out.println("Modulus: " + mtkCanggih.modulus(56, 3));
        System.out.println("Kombinasi (Tambah + Kali): " + mtkCanggih.kombinasiTambahKali(55, 35, 300));
    }
}

