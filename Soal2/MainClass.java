package Soal2;

public class MainClass {
    public static void main(String[] args) {
        TransportasiManager manager = new TransportasiManager();

        try {
            manager.tambahTransportasi(new Pesawat());
            manager.tambahTransportasi(new Helikopter());
            manager.tambahTransportasi(new Drone());

            // Simulasi error
            manager.tambahTransportasi(null);
        } catch (Exception e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }

        System.out.println("\nLaporan Transportasi Udara yang Terbang:");
        manager.tampilkanLaporanTerbang();
    }
}