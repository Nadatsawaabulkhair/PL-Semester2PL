package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNIM;
    private JLabel LabelHasil;
    private JPanel rootPanel;
    private JButton buttonSave;

    public FormBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String nim = textNIM.getText();
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNIM (nim);
                LabelHasil.setText(
                                 "Nama\t\t: " + mhs.getNama() + "\n"
                                + "NIM\t\t: " + mhs.getNIM () + "\n"
                                + "Jenjang Pendidikan\t\t: " + mhs.jenjangPendidikan() + "\n"
                                + "Angkatan\t\t: " + mhs.angkatan() + "\n"
                                + "Fakultas\t\t: " + mhs.fakultas() + "\n"
                                + "Prodi\t\t: " + mhs.prodi() + "\n"
                                + "Jenis Kelamin\t\t: " + mhs.jenisKelamin() +"\n"

                );
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
