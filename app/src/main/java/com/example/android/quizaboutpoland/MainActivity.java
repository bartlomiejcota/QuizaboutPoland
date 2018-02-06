package com.example.android.quizaboutpoland;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer polandSong = MediaPlayer.create(MainActivity.this, R.raw.song);
        polandSong.setLooping(true);
        polandSong.start();
    }
    /**
     * This method is called when the COUNTT RESULTS button is clicked.
     */
    public void getResult(View view) {
        RadioButton question1 = (RadioButton) findViewById(R.id.question1_2);
        if(question1.isChecked()) score += 1;
        RadioButton question2 = (RadioButton) findViewById(R.id.question2_1);
        if(question2.isChecked()) score += 1;
        RadioButton question3 = (RadioButton) findViewById(R.id.question3_3);
        if(question3.isChecked()) score += 1;
        RadioButton question4 = (RadioButton) findViewById(R.id.question4_2);
        if(question4.isChecked()) score += 1;
        CheckBox question5_1 = (CheckBox) findViewById(R.id.question5_1);
        CheckBox question5_2 = (CheckBox) findViewById(R.id.question5_2);
        CheckBox question5_3 = (CheckBox) findViewById(R.id.question5_3);
        CheckBox question5_4 = (CheckBox) findViewById(R.id.question5_4);
        CheckBox question5_5 = (CheckBox) findViewById(R.id.question5_5);
        CheckBox question5_6 = (CheckBox) findViewById(R.id.question5_6);
        if(question5_1.isChecked() == true &&
                question5_2.isChecked() == false &&
                question5_3.isChecked() == true &&
                question5_4.isChecked() == false &&
                question5_5.isChecked() == false &&
                question5_6.isChecked() == false) score += 1;
        EditText question6 = (EditText) findViewById(R.id.question6);
        String s1 = "warsaw";
        if(question6.getText().toString().equalsIgnoreCase(s1)) score += 1;
        displayResultInfo(score);
        score = 0;
    }
    /**
     * This method create result of quiz and print it on the screen
     * @param points - amount of points
     */
    private void displayResultInfo(int points){
        TextView info = (TextView) findViewById(R.id.result_info);
        String result = String.format("%.2f", ((float)points*100/6));
        info.setText("Your result is " + result +"%!");
    }






}
