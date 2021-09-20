package PemrogramanMahir3.satu;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInputUser {
    // Property
    private static int[] data;
    // Konstruktor
    public BinarySearchInputUser(int n) {
        data = new int[n];
    }
    // Fungsi Set Data
    public void SetData(int index, int value) {
        if(index >= 0 && index < data.length) {
            data[index] = value;
        }
    }
    //	Sorting Ascending
    public static void sorting() {
        int temp;
        for(int x = 0; x < data.length; x++) {
            for(int y = 0; y < data.length; y++) {
                if(x == y)
                    continue;

                else {
                    if(data[x] < data[y])
                    {
                        temp = data[y];
                        data[y] = data[x];
                        data[x] = temp;

                    }
                }
            }
        }
    }
    // Fungsi Pencarian Bagi Dua
    public int Cari(int x) {
        int i = 0;
        int j = data.length-1;
        return CariBagiDua(x, i, j);
    }
    // Fungsi Rekursif Pencarian Bagi Dua
    private int CariBagiDua(int x, int i, int j) {
        // Cek jarak i ke j
        if((j-i) >= 0) {
            // Tentukan titik tengah k
            int k = (j+i)/2;
            // Cek
            if(x == data[k]) {
                return k;
            } else if(x < data[k]) {
                return CariBagiDua(x, i, k-1);
            } else {
                return CariBagiDua(x, k+1, j);
            }
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // Inisiasi Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang data : ");
        int panjangData = scanner.nextInt();

        // Buat objek
        BinarySearchInputUser bs1 = new BinarySearchInputUser(panjangData);
        // Masukkan data
        for(int i = 0; i < panjangData; i++){
            System.out.print("Nilai Ke-"+ (i+1) +" : ");
            int input = scanner.nextInt();
            bs1.SetData(i, input);
        }
        // Menampilkan Data Array sebelum disorting
        System.out.println("Data Array sebelum disorting= " + Arrays.toString(data));
        // sorting
        sorting();
        // Menampilkan Data Array sesudah disorting
        System.out.println("Data Array setelah disorting = " + Arrays.toString(data));

        // Mengambil Data Target Pencarian
        System.out.print("Masukkan Nilai yang ingin anda Cari = ");
        int input = scanner.nextInt();
        // Statement Proses
        if (bs1.Cari(input) < 0) {
            System.out.printf("Angka %d tidak terdapat pada array\n",input);
        } else if (bs1.Cari(input) >= 0) {
            System.out.printf("Angka %d terdapat pada array index ke %d\n",input,bs1.Cari(input));
        }
    }
}
