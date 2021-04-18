package TugasGCR;

public class NIM {
    private String nim;

    public NIM(String nim) {
        this.nim = nim;
    }

    // sample : 12050120313

    // 1
    public String jenjangPendidikan() {
        String jenjang = this.nim.substring(0, 1);

        if (jenjang.equalsIgnoreCase("1")) {
            return "S1 (Sarjana)";
        }else if (jenjang.equalsIgnoreCase("2")) {
            return "S2 (Magister)";
        }else if (jenjang.equalsIgnoreCase("3")) {
            return "S3 (Doktor)";
        }
        return "NOT FOUND";
    }

    // 18 19 20
    public String angkatan() {
        if (this.nim.substring(1,3).equalsIgnoreCase("18")) {
            return "2018";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("19")) {
            return "2019";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("20")) {
            return "2020";
        }else {
            return "NOT FOUND";
        }
    }

    // 5
    public String fakultas() {
        String fac =  this.nim.substring(3,4);
        if (fac.equalsIgnoreCase("5")) {
            return "Fakultas Saintek";
        }else if (fac.equalsIgnoreCase("1")) {
            return "Fakultas Ekonomi";
        }else if (fac.equalsIgnoreCase("2")) {
            return "Fakultas MIPA";
        }else if (fac.equalsIgnoreCase("3")) {
            return "Fakultas Hukum";
        }else {
            return "NOT FOUND";
        }
    }


    // 01
    public String prodi() {
        if (this.nim.substring(4, 6).equalsIgnoreCase("01")) {
            return "Prodi Teknik Informatika";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("02")) {
            return "Prodi Teknik Industri";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("03")) {
            return "Sistem Informasi";
        }
        return "NOT FOUND";
    }

    // 01
    public String jenisKelamin() {
        if (this.nim.substring(6, 7).equalsIgnoreCase("1")) {
            return "Laki-Laki";
        }else if (this.nim.substring(6, 7).equalsIgnoreCase("2")){
            return "Perempuan";
        }
        return "NOT FOUND";
     }
    }
