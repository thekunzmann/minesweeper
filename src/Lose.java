import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Lose extends JFrame {


    JFrame lose = new JFrame();
    JPanel losePanel;
    JButton loseButton = new JButton();


    public Lose( ) {

        lose.setVisible(true);

        setTitle("YOU LOST!");
        lose.setPreferredSize(new Dimension(300,300));
        JOptionPane.showMessageDialog(lose, "The game ended");
        losePanel = new JPanel();
        loseButton.setText("Restart the Game");
        loseButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                lose.dispose();
                new Difficulty();

            }

        });
        losePanel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        lose.add(loseButton);
        lose.pack();
        lose.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 150));

    }
}