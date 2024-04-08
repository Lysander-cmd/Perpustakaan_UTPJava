/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp_genap2;

/**
 *
 * @author USER
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pegawai pegawaiPerpus = new Pegawai("Lysander Arshaq Yafiq", "235150407111072");
        Perpustakaan perpus = new Perpustakaan(pegawaiPerpus);
        
pegawaiPerpus.menambahBuku("Tutorial Java", "Graita", 2);
pegawaiPerpus.menambahBuku("Tutorial Phyton", "Safir", 2);
pegawaiPerpus.menambahBuku("Tutorial Javascript", "Bagus", 2);
pegawaiPerpus.menambahBuku("Tutorial Golang", "Budi", 2);

pegawaiPerpus.menambahPelanggan("Wildan", "1");
pegawaiPerpus.menambahPelanggan("Machsun", "2");
pegawaiPerpus.menambahPelanggan("Adin", "3");
pegawaiPerpus.menambahPelanggan("Machsun", "4");
perpus.pinjam("Wildan", "Tutorial Java");
perpus.pinjam("Machsun", "Tutorial Java");
perpus.pinjam("Adin", "Tutorial Java");
perpus.pinjam("Adin", "Tutorial Phyton");
perpus.pinjam("Wildan", "Tutorial Golang");
perpus.pinjam("Wildan", "Tutorial Javascript");
perpus.pinjam("Wildan", "Tutorial Phyton");
perpus.pinjam("Cantika", "Tutorial Golang");
perpus.pinjam("Machsun", "Sastra Inggris");
perpus.pinjam("Adin", "Tutorial Phyton");
perpus.pinjam("Cantika", "Cara cepat belajar Phyton");
perpus.tampilkanInfoPerpustakaan();
}
    
    
}
