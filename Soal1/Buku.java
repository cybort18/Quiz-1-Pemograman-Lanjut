package Soal1;

public class Buku {
    private String judul;
    private String penulis;
    private int jumlahSalinan;

    public Buku(String judul, String penulis, int jumlahSalinan) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahSalinan = jumlahSalinan;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getJumlahSalinan() {
        return jumlahSalinan;
    }

    public void setJumlahSalinan(int jumlahSalinan) {
        this.jumlahSalinan = jumlahSalinan;
    }

    public void kurangiSalinan() {
        if (jumlahSalinan > 0) {
            jumlahSalinan--;
        } else {
            System.out.println("Stok buku habis: " + judul);
        }
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Salinan: " + jumlahSalinan;
    }
}