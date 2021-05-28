package TugasGUI;

import javax.swing.*;

public class RunFormMhs {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Form Biodata");
        jframe.setContentPane(new FormMhs().getRootPanel());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setSize(500,400);
        jframe.setVisible(true);
    }
}
