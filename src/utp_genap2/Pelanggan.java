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
public class Pelanggan {
     private String nama;
    private String nomorPelanggan;
    private Buku[] bukuPinjaman = new Buku[3];
    private int jumlahBukuPinjaman = 0;

    Pelanggan(String nama, String nomorPelanggan) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public void setNomorPelanggan(String nomorPelanggan) {
        this.nomorPelanggan = nomorPelanggan;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    void tambahBuku(Buku bukuPinjam) {
        if (jumlahBukuPinjaman != 3) {
            bukuPinjaman[jumlahBukuPinjaman++] = bukuPinjam;
        }
    }

    void tampilkanInfoPelanggan() {
        System.out.print("Nama : " + nama +
                "\nNomor Pelanggan : " + nomorPelanggan +
                "\nBuku Yang Dipinjam : ");
        if (jumlahBukuPinjaman == 0)
            System.out.println("Tidak Ada");
        else {
            System.out.println();
            for (int i = 0; i < jumlahBukuPinjaman; i++) {
                System.out.println((i + 1) + ". " + bukuPinjaman[i].getJudul());
            }
        }
    }
}
