import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.*;

public class Cell extends JPanel implements MouseListener {

    private JLabel text;
    private boolean isBomb;
    public int num;
    private static int bombCount;
    private static int emptyCount;
    public JFrame frame;
    public JPanel panel2;

    public Cell(Difficulty.rank rank) {

        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        text = new JLabel("x");
        num = 0;
        add(text);
        addMouseListener(this);

        switch (rank) {
            case Beginner:
                if (new Random().nextInt(8) == 0) {
                    setBomb(true);
                }
                break;
            case Intermediate: {
                if (new Random().nextInt(5) == 0)
                    setBomb(true);
            }
            break;
            case Advanced:
                if (new Random().nextInt(3) == 0) {
                    setBomb(true);
                }
                break;
        }
    }


    public void setText(String s) {
        text.setText(s);
    }


    public void setNum(Cell t) {
        if (t.isBomb())
            num++;
    }

    public boolean isBomb() {
        return isBomb;
    }

    public void setBomb(boolean isBomb) {
        this.isBomb = isBomb;
        bombCount++;

    }

    public static int getBombCount() {
        return bombCount;
    }

    private boolean check() {
        if (isBomb) {
            setBackground(Color.RED);
            setText("*");
            new Lose();
            bombCount =0;

        } else {
            emptyCount++;
            setBackground(Color.GREEN);
            setText(num + "");
            if(Value.I * Value.J -  emptyCount== getBombCount()){
                new Lose();

            }
        }

        sh();
        return isBomb;
    }

    public void sh() {
        text.setVisible(true);
    }

    public void hd() {
        text.setVisible(false);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (check()) {
            Cell.this.getTopLevelAncestor();
        }
    }
}