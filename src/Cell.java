import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cell extends JPanel implements MouseListener {

    private JLabel text;
    private boolean isBomb;
    public int num;


    public Cell() {

        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        text = new JLabel("x");
        num = 0;
        add(text);
        addMouseListener(this);
        randomize();
    }

    public void setText(String s) {
        text.setText(s);
    }

    private void randomize() {
        if (new Random().nextInt(8) == 0)
            setBomb(true);
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
    }

    private boolean check() {
        if (isBomb) {
            setBackground(Color.RED);
            setText("*");
            new Lose();
        } else {
            setBackground(Color.GREEN);
            setText(num + "");
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