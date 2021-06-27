package UAS; // menandakan bahwa class ini berada di package UAS

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormRekursif {
    private JTextField textAngka;
    private JButton mulaiButton;
    private JPanel rootPanel;
    private JLabel HasilLabel;
    private JTextField textPangkat;

    public FormRekursif() {
        mulaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // mengambil input dan merubahnya kedalam tipedata integer
                int ank = Integer.parseInt(textAngka.getText());
                int pkt = Integer.parseInt(textPangkat.getText());
                //membuat object dari class rekursif dan mengolah data
                rekursif rkf = new rekursif();
                rkf.setAngka(ank);
                rkf.setPangkat(pkt);
                // menampilkan output yang berasal dari data di class rekursif
                HasilLabel.setText(String.valueOf(rkf.hitung(rkf.angka, rkf.pangkat)));
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
