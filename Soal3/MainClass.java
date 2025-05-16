package Soal3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        String namaFile = "nilai.txt";

        // Menulis file nilai
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            writer.write("80\n65\n90\n75\n70\n85\n");
            System.out.println("File " + namaFile + " berhasil dibuat.");
        } catch (IOException e) {
            System.out.println("Gagal membuat file: " + e.getMessage());
            return;
        }

        StudentDataManager manager = new StudentDataManager();

        try {
            manager.bacaDariFile(namaFile);

            System.out.println("\nNilai sebelum diurutkan:");
            manager.tampilkanNilai();

            System.out.println("\nMengurutkan data nilai (MergeSort)...");
            manager.mergeSort();
            manager.tampilkanNilai();

            System.out.println("\nMencari nilai 75:");
            int index1 = manager.cariNilai(75);
            if (index1 != -1) {
                System.out.println("Nilai 75 ditemukan di indeks: " + index1);
            } else {
                System.out.println("Nilai 75 tidak ditemukan.");
            }

            System.out.println("\nMencari nilai 100:");
            int index2 = manager.cariNilai(100);
            if (index2 != -1) {
                System.out.println("Nilai 100 ditemukan di indeks: " + index2);
            } else {
                System.out.println("Nilai 100 tidak ditemukan.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}