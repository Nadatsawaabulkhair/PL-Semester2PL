package PemrogramanMahir3.dua;

import java.util.Scanner;

public class BubbleSortInputUser {

    public static void main(String[]args) {
        // deklarasi variabel
        int jumlah,i,j, swap;
        // deklarasi scanner
        Scanner scan = new Scanner(System.in);

        // inisiasi scanner
        System.out.print("Masukkan Jumlah Data: ");
        jumlah = scan.nextInt();

        // inisiasi array
        int array[] = new int[jumlah];

        // memasukkan data ke array
        for(i=0; i<jumlah;i++) {
            System.out.print("Nilai Ke-" + (i+1) +" : ");
            array[i]=scan.nextInt();
        }

        System.out.println("Data sebelum diurutkan =");
        // print data awal
        for(int a=0;a<jumlah;a++) {
            System.out.print(array[a] +" ");
        }

        // sorting
        for(i=0; i<(jumlah-1);i++) {
            for(j=0;j<jumlah-i-1;j++)
            {
                if (array[j] > array[j+1])
                {
                    swap = array[j];
                    array[j] = array[j+1];
                    array[j+1]=swap;
                }
            }
        }

        System.out.print("\nData setelah diurutkan =");
        // menampilkan data setelah diurutkan
        for(i=0;i<jumlah; i++)
            System.out.print(array[i] +" ");
    }
}
