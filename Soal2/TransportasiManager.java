package Soal2;

import java.util.ArrayList;

public class TransportasiManager {
    private ArrayList<AlatTransportasiUdara> daftarTransportasi;

    public TransportasiManager() {
        daftarTransportasi = new ArrayList<>();
    }

    public void tambahTransportasi(AlatTransportasiUdara transportasi) throws Exception {
        if (transportasi == null) {
            throw new Exception("Objek transportasi tidak valid (null)");
        }
        daftarTransportasi.add(transportasi);
    }

    public void tampilkanLaporanTerbang() {
        for (AlatTransportasiUdara t : daftarTransportasi) {
            t.terbang(); // polimorfisme di sini
        }
    }
}