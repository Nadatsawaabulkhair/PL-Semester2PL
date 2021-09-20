package PemrogramanMahir3.satu;

import java.util.Arrays;
import java.util.Scanner;

public class SequentialSearchInputUser {

    // Data Array yang akan diurutkan
    private final int[] data;

    private SequentialSearchInputUser(int n) {
        this.data = new int[n];
    }

    private void setData(int index, int value) {
        if (index >= 0 && index < this.data.length) {
            this.data[index] = value;
        }
    }

    private int Search(int s) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == s) {
                return i;
            }
        }
        return -1;
    }

    private void TampilkanArray() {
        System.out.println("Data Array = " + Arrays.toString(this.data));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Panjang data = ");
        int panjangData = scanner.nextInt();
        SequentialSearchInputUser ss = new SequentialSearchInputUser(panjangData);

        for(int i = 0; i < panjangData; i++){
            System.out.print("Nilai Ke-"+ (i+1) +" : ");
            int input = scanner.nextInt();
            ss.setData(i, input);
        }

        System.out.print("Masukkan Nilai yang ingin anda Cari = ");
        int input = scanner.nextInt();

        if (ss.Search(input) == -1) {
            System.out.printf("Angka %d tidak terdapat pada array\n",input);
        } else if (ss.Search(input) != -1) {
            System.out.printf("Angka %d terdapat pada array index ke %d\n",input,ss.Search(input));
        }

        ss.TampilkanArray();
    }
}
