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
public class Pegawai {
      private String nama;
    private String nomorPegawai;

    public Pegawai(String nama, String nomorPegawai) {
        this.nama = nama;
        this.nomorPegawai = nomorPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }

    public void tampilkanInfoPegawai() {
        System.out.println("Nama : " + nama +
                "\nNomor Pegawai : " + nomorPegawai);
    }

    public void menambahPelanggan(String nama, String nomorPelanggan) {
        for (int i = 0; i < Perpustakaan.listPelanggan.length; i++) {
            Pelanggan plgn = Perpustakaan.listPelanggan[i];
            if (plgn == null) {
                Perpustakaan.listPelanggan[i] = new Pelanggan(nama, nomorPelanggan);
                return;
            }
            else if (plgn.getNama().equalsIgnoreCase(nama)) {
                
                return;
            }
        }
        System.out.println("Pelanggan dalam sistem sudah penuh!");
    }

    public void menambahBuku(String judul, String penulis, int jumlah) {
        for (int i = 0; i < Perpustakaan.listBuku.length; i++) {
            Buku bku = Perpustakaan.listBuku[i];
            if (bku == null) {
                Perpustakaan.listBuku[i] = new Buku(judul, penulis, jumlah);
                return;
            }
            else if (bku.getJudul().equalsIgnoreCase(judul)) {
                Perpustakaan.listBuku[i].setJumlah(Perpustakaan.listBuku[i].getJumlah() + jumlah);
                return;
            }
        }
        System.out.println("Buku dalam sistem sudah penuh!");
    }
  
    
}
