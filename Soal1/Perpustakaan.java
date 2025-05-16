package Soal1;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> daftarBuku;

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public Buku cariBuku(String judul) {
        for (Buku b : daftarBuku) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                return b;
            }
        }
        return null;
    }

    public void pinjamBuku(String judul) {
        Buku b = cariBuku(judul);
        if (b != null) {
            b.kurangiSalinan();
            System.out.println("Berhasil meminjam buku: " + judul);
        } else {
            System.out.println("Buku tidak ditemukan: " + judul);
        }
    }

    public void tampilkanDaftarBuku() {
        for (Buku b : daftarBuku) {
            System.out.println(b);
        }
    }
}
