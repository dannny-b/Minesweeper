package de.hsos.danibloc.prog3.minesweeper.ui;

import java.util.ArrayList;
import java.util.List;

public class Board{
    List<Cell> cells;
    private int size;

    public Board(int size){
        cells = new ArrayList<>();
        for (int i = 0; i < (size*size); i++) {
            cells.add(new Cell(Cell.BLANK));
        }
    }
}
