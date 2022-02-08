package com.example.krohunter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    /*
           Android runs this code just before
           the player sees the app.
           This makes it a good place to add
           the code for the one-time setup phase.
  */




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /*
           This code will execute when a new
           game needs to be started. It will
           happen when the app is first started
           and after the player wins a game.
*/

    void newGame() {

    }
       /*
           Here we will do all the drawing.
           The grid lines, the HUD and
           the touch indicator
*/

    void draw() {

    }

       /*
           This part of the code will
           handle detecting that the player
           has tapped the screen
*/

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {

    }
       /*
           The code here will execute when
           the player taps the screen. It will
           calculate the distance from the sub'
           and decide a hit or miss
 */

    void takeShot() {

    }

    // This code says "BOOM!"

    void boom() {

    }
    // This code prints the debugging text

    void printDebuggingText() {

    }

}