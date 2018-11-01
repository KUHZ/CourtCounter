package com.example.ghz.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the score for 3 points.
     */
    public void plusthree(View view){
        displayForTeamA(3);
    }

    /**
     * Displays the score for 2 points.
     */
    public void plustwo(View view){
        displayForTeamA(2);
    }

    /**
     * Displays the score for free throw.
     */
    public void plusone(View view){
        displayForTeamA(1);
    }


}
