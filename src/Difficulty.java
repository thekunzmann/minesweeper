import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Difficulty extends JFrame {


    public enum rank {
        Beginner,
        Intermediate,
        Advanced;
    }

    public rank rank;

    JFrame starterFrame;
    JPanel startGame;
    JLabel chooseRank;
    JButton beginner;
    JButton intermediate;
    JButton advanced;


    public Difficulty() { difficultyInterface();
    }

    public void difficultyInterface()

    {

        starterFrame = new JFrame();
        starterFrame.setSize(300, 300);
        starterFrame.pack();
        startGame = new JPanel();
        startGame.setLayout(new BoxLayout(startGame, BoxLayout.PAGE_AXIS));

        chooseRank = new JLabel("Choose your Rank!");
        chooseRank.setAlignmentX(Component.CENTER_ALIGNMENT);


        beginner = new JButton("Beginner");
        beginner.setAlignmentX(Component.CENTER_ALIGNMENT);
        beginner.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                rank = rank.Beginner;
                new Game();
            }
        });

        intermediate = new JButton("Intermediate");
        intermediate.setAlignmentX(Component.CENTER_ALIGNMENT);
        intermediate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                rank = rank.Intermediate;

                new Game();
            }
        });

        advanced = new JButton("Advanced");
        advanced.setAlignmentX(Component.CENTER_ALIGNMENT);
        advanced.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                rank = rank.Advanced;

                new Game();
            }
        });

        starterFrame.add(startGame);
        starterFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        starterFrame.pack();
        starterFrame.setVisible(true);

        startGame.add(chooseRank);
        startGame.add(beginner);
        startGame.add(intermediate);
        startGame.add(advanced);
        startGame.add(Box.createRigidArea(new Dimension(0,5)));
    }

}