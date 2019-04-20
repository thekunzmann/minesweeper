import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Difficulty extends JFrame {


    public enum rank {
        Beginner,
        Intermediate,
        Advanced,
    }

    public rank rank;

    JFrame starterFrame;
    JPanel startGame;
    JLabel title;
    JLabel chooseRank;
    JButton beginner;
    JButton intermediate;
    JButton advanced;



    public Difficulty() { difficultyInterface();
    }

    public void difficultyInterface()

    {
        starterFrame = new JFrame("Minesweeper Game");
        starterFrame.pack();
        starterFrame.setSize(400,400);

        startGame = new JPanel();
        startGame.setLayout(new BoxLayout(startGame, BoxLayout.PAGE_AXIS));
        startGame.add(Box.createRigidArea(new Dimension(400,20)));

        title = new JLabel("THE MINESWEEPER GAME");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        title.setFont(title.getFont().deriveFont(32f));
        title.setForeground(Color.blue);

        chooseRank = new JLabel("Choose your Rank!");
        chooseRank.setAlignmentX(Component.CENTER_ALIGNMENT);
        chooseRank.add(Box.createRigidArea(new Dimension(400,50)));

        beginner = new JButton("Beginner");
        beginner.add(Box.createRigidArea(new Dimension(400, 25)));
        beginner.setAlignmentX(Component.CENTER_ALIGNMENT);
        beginner.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                rank = rank.Beginner;
                new Game(rank.Beginner);
                starterFrame.dispose();
            }
        });

        intermediate = new JButton("Intermediate");
        intermediate.add(Box.createRigidArea(new Dimension(400, 25)));
        intermediate.setAlignmentX(Component.CENTER_ALIGNMENT);
        intermediate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                rank = rank.Intermediate;

                new Game(rank.Intermediate);
                starterFrame.dispose();
            }
        });

        advanced = new JButton("Advanced");
        advanced.setAlignmentX(Component.CENTER_ALIGNMENT);
        advanced.add(Box.createRigidArea(new Dimension(400, 25)));
        advanced.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                rank = rank.Advanced;

                new Game(rank.Advanced);
                starterFrame.dispose();
            }
        });

        starterFrame.add(startGame);
        starterFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        starterFrame.pack();
        starterFrame.setSize(600,500);
        starterFrame.setVisible(true);

        startGame.add(Box.createRigidArea(new Dimension(600, 100)));
        startGame.add(title);
        startGame.add(chooseRank);
        startGame.add(beginner);
        startGame.add(intermediate);
        startGame.add(advanced);
    }

}