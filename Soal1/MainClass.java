package Soal1;

public class MainClass {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        // Tambah buku
        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hirata", 3);
        Buku b2 = new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2);
        Buku b3 = new Buku("Bumi", "Tere Liye", 5);

        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);
        perpustakaan.tambahBuku(b3);

        // Tampilkan semua buku
        System.out.println("Daftar Buku di Perpustakaan:");
        perpustakaan.tampilkanDaftarBuku();

        // Cari buku
        System.out.println("\nMencari buku 'Bumi':");
        Buku hasilCari = perpustakaan.cariBuku("Bumi");
        if (hasilCari != null) {
            System.out.println("Ditemukan: " + hasilCari);
        } else {
            System.out.println("Buku tidak ditemukan.");
        }

        // Peminjaman
        System.out.println("\nMeminjam buku 'Bumi':");
        perpustakaan.pinjamBuku("Bumi");

        // Lihat perubahan salinan
        System.out.println("\nSetelah peminjaman:");
        perpustakaan.tampilkanDaftarBuku();
    }
}
