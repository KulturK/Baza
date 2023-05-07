import java.awt.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{

            JFrame frame = new JFrame("Baza mieszkańcow");
            frame.setDefaultCloseOperation(3);
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null);
            JMenuBar menuBar = new JMenuBar();
            menuBar.setBackground(Color.red);
            menuBar.setVisible(true);
            frame.setJMenuBar(menuBar);
            frame.setVisible(true);
        });

//        System.out.println("Hello world!");

    }
}