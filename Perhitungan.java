package Model;

import Interfaces.ContohInterface;

//mengambil/mengimplentasi dari ContohInterface semua class bisa digunakan disini
public class Perhitungan implements ContohInterface {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int _a,int _b,int _hasil ){
        this.a = _a;
        this.b = _b;
        _hasil = 0;
        this.hasil = _hasil;
        printJudulClass("Print Judul dalam Class Perhitungan ");

    }

    private void printJudulClass(String print_judul_dalam_class_perhitungan_) {
    }

    @Override
    public String PrintJudul(String judul) {
        String jdl;
        System.out.println("----Judul Menggunakan Interface----");
        return null;
    }

    @Override
    public int HitungTambah(int a, int b) {
        hasil = a + b;
        System.out.println(hasil);
        return hasil;
    }

    @Override
    public int HitungKali(int a, int b) {
        hasil = a * b;
        System.out.println(hasil);
        return hasil;
    }
}
