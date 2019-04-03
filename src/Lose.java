import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Lose extends JFrame {

    JPanel panel1;
    JFrame hello = new JFrame();
    Difficulty diff;

    JButton button = new JButton();


    public Lose( ) {

        hello.setVisible(true);

        setTitle("YOU LOST!");
        hello.setPreferredSize(new Dimension(300,300));
        JOptionPane.showMessageDialog(hello, "The game ended");
        panel1 = new JPanel();
        button.setText("Restart the Game");
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                hello.dispose();
                new Difficulty();

            }

        });
        panel1.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        hello.add(button);
        hello.pack();
        hello.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 150));

    }
}