package de.hsos.danibloc.prog3.minesweeper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import de.hsos.danibloc.prog3.minesweeper.logic.OnCellClickListener;
import de.hsos.danibloc.prog3.minesweeper.ui.Cell;
import de.hsos.danibloc.prog3.minesweeper.utility.Game;

public class MainActivity extends AppCompatActivity implements OnCellClickListener {
    RecyclerView gridRecyclerView;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void OnCellClick(Cell cell) {
        Toast.makeText(this,"clicked", Toast.LENGTH_SHORT);
    }
}