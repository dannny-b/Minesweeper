package de.hsos.danibloc.prog3.minesweeper.ui;

public class Cell {
    public static final int BLANK = 0;
    public static final int MINE = -1;

    private int state;
    public Cell (int state){
        this.state = state;
    }

    public int getState() {
        return state;
    }
}
