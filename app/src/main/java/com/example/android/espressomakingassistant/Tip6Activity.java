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
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This activity "activity_tip6" launches the view with Extraction Time tip
 */
public class Tip6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip6);
    }

    /**
     * this void method concatenates strings and launches an email intent
     * @param view - the current view
     */
    public void sendMessage(View view) {
        // Get Espresso Tip6's TextView Content
        TextView tip6text = (TextView) findViewById(R.id.textViewTip6);
        String tip6content = tip6text.getText().toString();


        // Use an intent to launch an email app.


        // Collect tip6 "Extraction Time" strings, setup email subject
        // and prompt the user to choose an email app to send the espresso making tips
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Extraction Time");
        intent.putExtra(Intent.EXTRA_TEXT, tip6content);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }
}
