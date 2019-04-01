import javax.swing.*;
import java.awt.*;

public class Lose extends JFrame {

    JPanel panel1;
    JFrame hello = new JFrame();


    JButton button = new JButton();

    public Lose() {

        hello.setVisible(true);
        setTitle("YOU LOST!");
        hello.setPreferredSize(new Dimension(300,300));

        panel1 = new JPanel();
        button.setText("Restart the Game");

        panel1.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        hello.add(button);
        hello.pack();
        hello.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 150));

    }
}