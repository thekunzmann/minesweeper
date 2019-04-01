

import java.awt.GridLayout;
import java.*;
import javax.swing.*;

public class Game extends JFrame{
    Cell[][] cells;
    GridLayout layout;
    JPanel panel;



    public Game() {





        setSize(Value.I * 50, Value.J * 50);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Minesweeper");

        panel = new JPanel();
        layout = new GridLayout(Value.I, Value.J);
        cells = new Cell[Value.I][Value.J];
        panel.setLayout(layout);
        panel.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));

        for(int i = 0; i < Value.I; i++) {
            for(int j = 0; j < Value.J; j++) {
                cells[i][j] = new Cell();
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
                panel.add(cells[i][j]);
            }
        }
        add(panel);
    }
}