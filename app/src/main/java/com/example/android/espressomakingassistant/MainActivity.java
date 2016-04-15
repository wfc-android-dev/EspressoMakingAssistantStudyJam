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


public class MainActivity extends AppCompatActivity {
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

        addListenerOnButton();


    }

    /**
     *
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
//                Toast.makeText(MainActivity.this,
//                        "ImageButton1 is clicked!", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Tip1Activity.class);
                startActivity(i);

            }

        });
        tipButton1.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
//                Toast.makeText(MainActivity.this,
//                        "TipButton1 is clicked!", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Tip1Activity.class);
                startActivity(i);

            }

        });
        imageButton2.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

//                Toast.makeText(MainActivity.this,
//                        "ImageButton2 is clicked!", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Tip2Activity.class);
                startActivity(i);

            }

        });
        tipButton2.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
//                Toast.makeText(MainActivity.this,
//                        "TipButton2 is clicked!", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Tip2Activity.class);
                startActivity(i);

            }

        });
        imageButton3.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

//                Toast.makeText(MainActivity.this,
//                        "ImageButton3 is clicked!", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Tip3Activity.class);
                startActivity(i);

            }

        });
        tipButton3.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
//                Toast.makeText(MainActivity.this,
//                        "TipButton3 is clicked!", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Tip3Activity.class);
                startActivity(i);

            }

        });
        imageButton4.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

//                Toast.makeText(MainActivity.this,
//                        "ImageButton4 is clicked!", Toast.LENGTH_SHORT).show();

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
//                Toast.makeText(MainActivity.this,
//                        "TipButton5 is clicked!", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Tip5Activity.class);
                startActivity(i);

            }

        });
        imageButton6.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {

//                Toast.makeText(MainActivity.this,
//                        "ImageButton6 is clicked!", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Tip6Activity.class);
                startActivity(i);

            }

        });
        tipButton6.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
//                Toast.makeText(MainActivity.this,
//                        "TipButton6 is clicked!", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Tip6Activity.class);
                startActivity(i);

            }

        });

    }

    public void sendMessage(View view) {

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


        // Send the order summary in the email body.
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, (String) getText(R.string.six_tips));
        intent.putExtra(Intent.EXTRA_TEXT, allthetips);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }


}
