package com.example.android.espressomakingassistant;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Tip5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip5);
    }

    public void sendMessage(View view) {
        // Get Espresso Tip5's TextView Content
        TextView tip5text = (TextView) findViewById(R.id.textViewTip5);
        String tip5content = tip5text.getText().toString();


        // Use an intent to launch an email app.


        // Send the order summary in the email body.
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Brewing Temperature");
        intent.putExtra(Intent.EXTRA_TEXT, tip5content);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }
}
