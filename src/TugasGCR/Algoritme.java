package TugasGCR;

import java.util.Scanner;
public class Algoritme {
    public static void main(String[] args) {
        String nimScan = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM anda : ");
        nimScan = scan.next();

        NIM nim = new NIM(nimScan);

        System.out.println("NIM : " + nimScan);
        System.out.println("Jenjang Pendidikan : " + nim.jenjangPendidikan());
        System.out.println("Angkatan : " + nim.angkatan());
        System.out.println("Fakultas : " + nim.fakultas());
        System.out.println("Prodi : " + nim.prodi());
        System.out.println("Jenis Kelamin : " + nim.jenisKelamin());
    }
}
