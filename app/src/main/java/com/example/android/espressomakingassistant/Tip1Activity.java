package com.example.android.espressomakingassistant;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Tip1Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip1);
    }

    public void sendMessage(View view) {
        // Get Espresso Tip1's TextView Content
        TextView tip1text = (TextView) findViewById(R.id.textViewTip1);
        String tip1content = tip1text.getText().toString();


        // Use an intent to launch an email app.


        // Send the order summary in the email body.
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Bean Preparation");
        intent.putExtra(Intent.EXTRA_TEXT, tip1content);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }


}
