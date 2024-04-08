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
public class Perpustakaan {
   static Buku[] listBuku = new Buku[100];
    public Pegawai pegawaiPerpus;
    static Pelanggan[] listPelanggan = new Pelanggan[20];

    Perpustakaan(Pegawai pegawaiPerpus) {
        this.pegawaiPerpus = pegawaiPerpus;
    }

    void pinjam(String namaPelanggan, String judulBuku) {
        Buku buku = cariBuku(judulBuku);
        if (buku == null || buku.getJumlah() == 0) {
             return;
        }
        else {
            for (int i = 0; i < listPelanggan.length; i++) {
                if (listPelanggan[i] == null) {
                     return;
                }
                else {
                    if (listPelanggan[i].getNama().equalsIgnoreCase(namaPelanggan)) {
                        if (listPelanggan[i].getJumlahBukuPinjaman() != 3) {
                            listPelanggan[i].tambahBuku(buku);
                            buku.setJumlah(buku.getJumlah() - 1);
                            return;
                        }
                           }
                }
            }
        }
    }

    Buku cariBuku(String judulBuku) {
        for (int i = 0; i < listBuku.length; i++) {
            Buku bku = listBuku[i];
            if (bku == null)
                break;
            else {
                if (bku.getJudul().equalsIgnoreCase(judulBuku))
                    return bku;
            }
        }
        return null;
    }

    void tampilkanInfoPerpustakaan() {
        System.out.println("====================================\n");
        System.out.println("Informasi Pegawai di Perpustakaan : ");
        pegawaiPerpus.tampilkanInfoPegawai();
        System.out.println("\n====================================");

        System.out.println("\nDaftar Pelanggan di Perpustakaan : \n");
        for (int i = 0; i < listPelanggan.length; i++) {
            if (listPelanggan[i] == null)
                break;
            else {
                listPelanggan[i].tampilkanInfoPelanggan();
                System.out.println();
            }
        }

        System.out.println("\n====================================");

        System.out.println("\nDaftar Buku di Perpustakaan : \n");
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i] == null)
                break;
            else {
                listBuku[i].tampilkanInfoBuku();
                System.out.println();
            }
        }

        System.out.println("====================================");
    }

}
