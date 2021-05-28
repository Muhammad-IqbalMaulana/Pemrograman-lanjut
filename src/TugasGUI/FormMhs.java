package TugasGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormMhs {
    private JButton button1;
    private JTextField textNama;
    private JTextField textNIM;
    private JPanel rootPanel;
    private JLabel HasilLabel;
    private JLabel labelF;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;

    public FormMhs() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Action dari Button");
                String nama = textNama.getText();
                //mengambil data dari textnim
                String nim = textNIM.getText();
                //diproses
                NIMMahasiswa noNim = new NIMMahasiswa();
                noNim.setNama(nama);
                noNim.setNim(nim);
                //tampilkan output ke form
                HasilLabel.setText("Nama = " +noNim.getNma());
                labelF.setText("Jenjang pendidikan = " +noNim.getjenjang());
                label2.setText("Tahun masuk = " +noNim.getTahun());
                label3.setText("Fakultas = " +noNim.getFakultas());
                label4.setText("Prodi = " +noNim.getProdi());
                label5.setText("Jenis kelamin = " +noNim.getJenisKelamin());
                label6.setText("Nomor Urut Mahasiswa = " +noNim.getNomorUrut());


            }
        });
    }

    public JPanel getRootPanel(){
        return rootPanel;
    }
}
