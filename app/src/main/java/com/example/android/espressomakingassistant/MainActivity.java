/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.espressomakingassistant;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageButton;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * This app suggests 6 tips for making great espresso to the user
 * It also allows the user to email the tip/tips.
 */
public class MainActivity extends AppCompatActivity {

    //    6 ImageButtons and 6 Buttons declaration for the 6 tips images and buttons
    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;
    Button tipButton1;
    Button tipButton2;
    Button tipButton3;
    Button tipButton4;
    Button tipButton5;
    Button tipButton6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * call this method to start ImageButtons and Buttons listener
         */
        addListenerOnButton();


    }

    /**
     * This void method sets up the buttons listeners
     */
    public void addListenerOnButton() {

        imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        tipButton1 = (Button) findViewById(R.id.tipButton1);
        tipButton2 = (Button) findViewById(R.id.tipButton2);
        tipButton3 = (Button) findViewById(R.id.tipButton3);
        tipButton4 = (Button) findViewById(R.id.tipButton4);
        tipButton5 = (Button) findViewById(R.id.tipButton5);
        tipButton6 = (Button) findViewById(R.id.tipButton6);


        imageButton1.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(MainActivity.this, Tip1Activity.class);
                startActivity(i);

            }

        });
        tipButton1.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(MainActivity.this, Tip1Activity.class);
                startActivity(i);

            }

        });
        imageButton2.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {


                Intent i = new Intent(MainActivity.this, Tip2Activity.class);
                startActivity(i);

            }

        });
        tipButton2.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {


                Intent i = new Intent(MainActivity.this, Tip2Activity.class);
                startActivity(i);

            }

        });
        imageButton3.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(MainActivity.this, Tip3Activity.class);
                startActivity(i);

            }

        });
        tipButton3.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {


                Intent i = new Intent(MainActivity.this, Tip3Activity.class);
                startActivity(i);

            }

        });
        imageButton4.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(MainActivity.this, Tip4Activity.class);
                startActivity(i);

            }

        });
        tipButton4.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
                Toast.makeText(MainActivity.this,
                        "TipButton4 is clicked!", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Tip4Activity.class);
                startActivity(i);

            }

        });
        imageButton5.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

                Toast.makeText(MainActivity.this,
                        "ImageButton5 is clicked!", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Tip5Activity.class);
                startActivity(i);

            }

        });
        tipButton5.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(MainActivity.this, Tip5Activity.class);
                startActivity(i);

            }

        });
        imageButton6.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(MainActivity.this, Tip6Activity.class);
                startActivity(i);

            }

        });
        tipButton6.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

                Intent i = new Intent(MainActivity.this, Tip6Activity.class);
                startActivity(i);

            }

        });

    }

    /**
     * this void method concatenates strings and launches an email intent
     *
     * @param view - the current view
     */
    public void sendMessage(View view) {

        // declare allthetips and concatenates all 6 tips from string resources

        String allthetips = "1. " + (String) getText(R.string.tip_one)
                + "\n\n" + (String) getText(R.string.bean_preparation)
                + "\n\n2. " + (String) getText(R.string.tip_two)
                + "\n\n" + (String) getText(R.string.bean_selection)
                + "\n\n3. " + (String) getText(R.string.tip_three)
                + "\n\n" + (String) getText(R.string.machine_selection)
                + "\n\n4. " + (String) getText(R.string.tip_four)
                + "\n\n" + (String) getText(R.string.proper_tamping)
                + "\n\n5. " + (String) getText(R.string.tip_five)
                + "\n\n" + (String) getText(R.string.brewing_temperature)
                + "\n\n6. " + (String) getText(R.string.tip_six)
                + "\n\n" + (String) getText(R.string.extraction_time);


        // Use an intent to launch an email app.


        // Collect the 6 tips and concatenate the strings, setup email subject
        // and prompt the user to choose an email app to send the espresso making tips

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, (String) getText(R.string.six_tips));
        intent.putExtra(Intent.EXTRA_TEXT, allthetips);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }


}
