package TugasSorting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sorting {
    private JTextField textAngka;
    private JButton buttonUrutkan;
    private JTable tableHasil;
    private JPanel rootPanel;
    private JTextField textBanyak;
    private DefaultTableModel tableModel;
    private Boolean added = false;



    public Sorting() {
       this.initComponents();
        buttonUrutkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String angka = textAngka.getText();
                if (angka.isEmpty()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "data belum lengkap",
                            "warning",
                            JOptionPane.WARNING_MESSAGE);
                }else {
                    tableModel.addRow(new Object[]{angka});
                    textAngka.setText(" ");
                }

                int banyak = Integer.parseInt(textBanyak.getText());

                if (!added) {
                    for (int i = 0; i < banyak; i++) {
                        tableModel.addRow(new Object[]{});
                    }
                    added = true;
                }
                int a = 0;
                for (int i : AppSort.getAsd(angka,banyak)) {
                    tableModel.setValueAt(i,a,0);
                    a++;
                }
                int b = 0;
                for (int i : AppSort.getDsd(angka, banyak)) {
                    tableModel.setValueAt(i,b,1);
                    b++;
                }

            }
        });
    }

    public JPanel getRootPanel(){
        return rootPanel;
    }

    private void initComponents(){
        Object[] tabelColom = {
                "Ascending",
                "Descending"

        };
        Object[][] initData = {

        };
        tableModel = new DefaultTableModel(initData, tabelColom);
        tableHasil.setModel(tableModel);
        tableHasil.setAutoCreateRowSorter(true);
        tableHasil.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
