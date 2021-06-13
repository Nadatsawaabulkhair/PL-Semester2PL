package gui.Table;

import javax.swing.*;

public class RunTableArray {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ignored) {
        }
        /**
         * Set image icon
         */
        ImageIcon imageIcon = new ImageIcon("res/sorting.jpg");
        JFrame jFrame = new JFrame("Aplikasi Untuk Memproses Data Angka Array");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new TableArrays ().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}