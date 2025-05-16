package Soal3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentDataManager {
    private ArrayList<Integer> nilaiList;

    public StudentDataManager() {
        nilaiList = new ArrayList<>();
    }

    // Membaca nilai dari file
    public void bacaDariFile(String namaFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int nilai = Integer.parseInt(line.trim());
                    nilaiList.add(nilai);
                } catch (NumberFormatException e) {
                    System.out.println("Data tidak valid, dilewati: " + line);
                }
            }
        }
    }

    // Merge Sort
    public void mergeSort() {
        nilaiList = mergeSort(nilaiList);
    }

    private ArrayList<Integer> mergeSort(ArrayList<Integer> data) {
        if (data.size() <= 1) return data;

        int mid = data.size() / 2;
        ArrayList<Integer> left = new ArrayList<>(data.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(data.subList(mid, data.size()));

        return merge(mergeSort(left), mergeSort(right));
    }

    private ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }
        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));
        return result;
    }

    // Linear Search
    public int cariNilai(int target) {
        for (int i = 0; i < nilaiList.size(); i++) {
            if (nilaiList.get(i) == target) return i;
        }
        return -1;
    }

    // Menampilkan data
    public void tampilkanNilai() {
        System.out.println("Daftar Nilai: " + nilaiList);
    }

    public ArrayList<Integer> getNilaiList() {
        return nilaiList;
    }
}