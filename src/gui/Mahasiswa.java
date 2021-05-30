package gui;

public class Mahasiswa {
    private String Nama ;
    private String NIM ;

    public Mahasiswa () {
    }

    public Mahasiswa ( String nama, String NIM ) {
        Nama = nama;
        this.NIM = NIM;
    }

    public String getNama () {
        return Nama;
    }

    public void setNama ( String nama ) {
        Nama = nama;
    }

    public String getNIM () {
        return NIM;
    }

    public void setNIM ( String NIM ) {
        this.NIM = NIM;
    }

    public String jenjangPendidikan() {
        String jenjang = this.NIM.substring(0, 1);

        if (jenjang.equalsIgnoreCase("1")) {
            return "S1(Sarjana)";
        }else if (jenjang.equalsIgnoreCase("2")) {
            return "S2(Magister)";
        }else if (jenjang.equalsIgnoreCase("3")) {
            return "S3(Doktor)";
        }
        return "error";
    }
    public String angkatan() {
        if (this.NIM.substring(1,3).equalsIgnoreCase("19")) {
            return "2019";
        }else if (this.NIM.substring(1,3).equalsIgnoreCase("20")) {
            return "2020";
        }else if (this.NIM.substring(1,3).equalsIgnoreCase("21")) {
            return "2021";
        }else {
            return "error";
        }
    }
    public String fakultas() {
        String fac =  this.NIM.substring(3,4);
        if (fac.equalsIgnoreCase("5")) {
            return "Fakultas Sains dan Teknologi";
        }else if (fac.equalsIgnoreCase("1")) {
            return "Fakultas Ushuluddin";
        }else if (fac.equalsIgnoreCase("2")) {
            return "Fakultas Syari'ah dan Hukum";
        }else if (fac.equalsIgnoreCase("3")) {
            return "Fakultas Tarbiyah dan Keguruan";
        }else {
            return "error";
        }
    }
    public String prodi() {
        if (this.NIM.substring(4, 6).equalsIgnoreCase("01")) {
            return "Prodi Teknik Informatika";
        }else if (this.NIM.substring(4, 6).equalsIgnoreCase("02")) {
            return "Prodi Matematika";
        }else if (this.NIM.substring(4, 6).equalsIgnoreCase("03")) {
            return "Sistem Industri";
        }
        return "error";
    }
    public String jenisKelamin() {
        if (this.NIM.substring(6, 7).equalsIgnoreCase("1")) {
            return "Laki-Laki";
        }else if (this.NIM.substring(6, 7).equalsIgnoreCase("2")){
            return "Perempuan";
        }
        return "error";
    }
}
