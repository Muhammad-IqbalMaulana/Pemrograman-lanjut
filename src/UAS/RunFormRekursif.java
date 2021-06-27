package UAS; // menandakan bahwa class ini berada di package UAS

import javax.swing.*; // kita memanggil javax.swing.*

public class RunFormRekursif { // class RunFormRekursif
    public static void main(String[] args) {// sebuah psvm berfungsi untuk menjalankan program
        ImageIcon imageIcon = new ImageIcon("res/icon.png");// mengambil icon pada folder res
        JFrame jframe = new JFrame("Form Faktorial"); // memberikan nama pada program
        jframe.setIconImage(imageIcon.getImage());// memasang icon untuk program
        jframe.setContentPane(new FormRekursif().getRootPanel());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setSize(500,400);// set ukuran
        jframe.setVisible(true);
    }
}
