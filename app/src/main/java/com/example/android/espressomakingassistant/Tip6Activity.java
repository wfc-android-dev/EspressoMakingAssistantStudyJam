package com.example.android.espressomakingassistant;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Tip6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip6);
    }

    public void sendMessage(View view) {
        // Get Espresso Tip6's TextView Content
        TextView tip6text = (TextView) findViewById(R.id.textViewTip6);
        String tip6content = tip6text.getText().toString();


        // Use an intent to launch an email app.


        // Send the order summary in the email body.
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Extraction Time");
        intent.putExtra(Intent.EXTRA_TEXT, tip6content);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }
}
