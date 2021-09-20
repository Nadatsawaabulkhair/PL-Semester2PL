package PemrogramanMahir3.dua;

import java.util.Scanner;

public class SelectionSortInputUser {
    // Data Array yang akan diurutkan
    private final int[] data;

    private SelectionSortInputUser(int n) {
        this.data = new int[n];
    }

    private void setData(int index, int value) {
        if (index >= 0 && index < this.data.length) {
            this.data[index] = value;
        }
    }

    // Method Print
    private void printData() {
        StringBuilder out = new StringBuilder("Data Array = ");
        for (int datum : this.data) {
            out.append(datum).append(", ");
        }
        System.out.println(out);
    }

    // Method untuk menukar
    private void Change(int i, int j) {
        int temp = this.data[i];
        this.data[i] = this.data[j];
        this.data[j] = temp;
    }

    // Method Sorting
    private void Sort() {
        for (int a = 0; a < this.data.length; a++) {
            int b = a;
            for (int i = a; i < this.data.length; i++) {
                if (this.data[i] < this.data[b]) {
                    b = i;
                }
            }
            Change(a, b);
        }
    }

    // Method main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        int panjang = scanner.nextInt();

        SelectionSortInputUser ss = new SelectionSortInputUser(panjang);

        for(int i = 0; i < panjang; i++){
            System.out.print("Nilai Ke-"+ (i+1) +" : ");
            int input = scanner.nextInt();
            ss.setData(i, input);
        }

        ss.Sort();
        ss.printData();
    }
}
