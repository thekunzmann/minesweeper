import java.awt.GridLayout;
import javax.swing.*;

public class Game extends JFrame{
    Cell[][] cells;
    JFrame gameFrame;
    GridLayout layout;
    JLabel numberMines;
    JPanel panel1;
    JPanel panel2;
    Difficulty.rank rank;


    public Game(Difficulty.rank rank) {

        gameFrame = new JFrame("Minesweeper Game");
        gameFrame.pack();
        gameFrame.setSize(400,400);

        this.rank = rank;
        setSize(Value.I * 50, Value.J * 50);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel1 = new JPanel();
        gameFrame.add(panel1);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));

        numberMines = new JLabel("Minesweeper with " + Cell.getBombCount() + " bombs");
        panel1.add(numberMines);

        panel2 = new JPanel();
        gameFrame.add(panel2);

        layout = new GridLayout(Value.I, Value.J);
        cells = new Cell[Value.I][Value.J];
        panel2.setLayout(layout);
        panel2.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));

        for(int i = 0; i < Value.I; i++) {
            for(int j = 0; j < Value.J; j++) {
                cells[i][j] = new Cell(rank);
            }
        }

        for(int i = 0; i < Value.I; i++) {
            for(int j = 0; j < Value.J; j++) {
                if(i == 0) {
                    if(j == 0) { //top left
                        cells[i][j].setNum(cells[i+1][j]);
                        cells[i][j].setNum(cells[i][j+1]);
                        cells[i][j].setNum(cells[i+1][j+1]);
                    }else if(j == Value.J - 1) { //top right
                        cells[i][j].setNum(cells[i+1][j]);
                        cells[i][j].setNum(cells[i][j-1]);
                        cells[i][j].setNum(cells[i+1][j-1]);
                    }else { //top row
                        cells[i][j].setNum(cells[i][j+1]);
                        cells[i][j].setNum(cells[i][j-1]);
                        cells[i][j].setNum(cells[i+1][j]);
                        cells[i][j].setNum(cells[i+1][j+1]);
                        cells[i][j].setNum(cells[i+1][j-1]);
                    }


                }else if(j == 0 && i < Value.I - 1 && i > 0) { //left corners
                    cells[i][j].setNum(cells[i-1][j]);
                    cells[i][j].setNum(cells[i+1][j]);
                    cells[i][j].setNum(cells[i][j+1]);
                    cells[i][j].setNum(cells[i-1][j+1]);
                    cells[i][j].setNum(cells[i+1][j+1]);
                }else if(i == Value.I-1) {
                    if(j == 0) { //bottom left
                        cells[i][j].setNum(cells[i-1][j]);
                        cells[i][j].setNum(cells[i][j+1]);
                        cells[i][j].setNum(cells[i-1][j+1]);
                    }else if(j == Value.J - 1) { //bottom right
                        cells[i][j].setNum(cells[i-1][j]);
                        cells[i][j].setNum(cells[i][j-1]);
                        cells[i][j].setNum(cells[i-1][j-1]);
                    }else { //bottom row
                        cells[i][j].setNum(cells[i][j-1]);
                        cells[i][j].setNum(cells[i][j+1]);
                        cells[i][j].setNum(cells[i-1][j]);
                        cells[i][j].setNum(cells[i-1][j-1]);
                        cells[i][j].setNum(cells[i-1][j+1]);
                    }
                }else if(j == Value.J - 1 && i < Value.I - 1 && i > 0) {
                    cells[i][j].setNum(cells[i-1][j]);
                    cells[i][j].setNum(cells[i+1][j]);
                    cells[i][j].setNum(cells[i][j-1]);
                    cells[i][j].setNum(cells[i-1][j-1]);
                    cells[i][j].setNum(cells[i+1][j-1]);
                }else { //middle stuff
                    cells[i][j].setNum(cells[i-1][j]);
                    cells[i][j].setNum(cells[i][j-1]);
                    cells[i][j].setNum(cells[i+1][j]);
                    cells[i][j].setNum(cells[i][j+1]);
                    cells[i][j].setNum(cells[i-1][j-1]);
                    cells[i][j].setNum(cells[i-1][j+1]);
                    cells[i][j].setNum(cells[i+1][j+1]);
                    cells[i][j].setNum(cells[i+1][j-1]);
                }
                panel2.add(cells[i][j]);
            }
        }

        setTitle("Minesweeper with " + Cell.getBombCount() + " bombs");
        System.out.println(Cell.getBombCount());

        add(panel1);
        add(panel2);

    }



}