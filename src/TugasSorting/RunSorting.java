package TugasSorting;

import javax.swing.*;

public class RunSorting {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        ImageIcon imageIcon = new ImageIcon("res/icon.png");
        JFrame jframe = new JFrame("Form Sorting");
        jframe.setIconImage(imageIcon.getImage());
        jframe.setContentPane(new Sorting().getRootPanel());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setSize(500,400);
        jframe.setVisible(true);
    }
}
