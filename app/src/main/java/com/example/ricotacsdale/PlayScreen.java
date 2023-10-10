package com.example.ricotacsdale;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class PlayScreen extends AppCompatActivity implements View.OnClickListener {

    String turn = "X";
    //Start off with X outside onCreate because I *THINK* it will mess something up
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);

        //9 tiles in total
        //tiles are counted left to right, top to bottom
        /*
          e.g   1   2   3
                4   5   6
                7   8   9
         */

        Button tile1 = findViewById(R.id.tile1);
        Button tile2 = findViewById(R.id.tile2);
        Button tile3 = findViewById(R.id.tile3);
        Button tile4 = findViewById(R.id.tile4);
        Button tile5 = findViewById(R.id.tile5);
        Button tile6 = findViewById(R.id.tile6);
        Button tile7 = findViewById(R.id.tile7);
        Button tile8 = findViewById(R.id.tile8);
        Button tile9 = findViewById(R.id.tile9);

        tile1.setOnClickListener(this);
        tile2.setOnClickListener(this);
        tile3.setOnClickListener(this);
        tile4.setOnClickListener(this);
        tile5.setOnClickListener(this);
        tile6.setOnClickListener(this);
        tile7.setOnClickListener(this);
        tile8.setOnClickListener(this);
        tile9.setOnClickListener(this);

        /* Brainstorm of how to change image of tiles
            Need two different conditions, Dale's turn, and Rico's turn
                have variable called turn?
            Need to check src/image of the tile being pressed
                If its the "empty" image then change
         */



    }

    public void changeSymbol(View v)
    {
        Button outBtn = (Button)findViewById(v.getId());
        outBtn.setText(turn);

        if(turn.equals( "X"))
        {
            turn = "O";
        }
        else
            turn = "X";
    }

    @Override
    //Like a toString
    public void onClick(View v)
    {
        Button outBtn = (Button)findViewById(v.getId());
        if(outBtn.getText().equals("Empty"))
        {
            changeSymbol(v);
        }
    }
}