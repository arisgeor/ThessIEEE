package com.example.aristos.thessieee;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //About us
        TextView about_us = (TextView) findViewById(R.id.about_us);
        about_us.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent aboutUsIntent = new Intent(MainActivity.this, AboutUs.class);
                startActivity(aboutUsIntent);
            }
        });

        //Events
        TextView events = (TextView) findViewById(R.id.events);
        events.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent openEvents = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ieee.ee.auth.gr/"));
                startActivity(openEvents);
            }
        });

        //Members
        TextView members = (TextView) findViewById(R.id.members);
        members.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent membersIntent = new Intent(MainActivity.this, Members.class);
                startActivity(membersIntent);
            }
        });

        //Button
        Button button = (Button) findViewById(R.id.contact_us);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL  , new String[] { "ieee.auth.sb@gmail.com" });
                intent.putExtra(Intent.EXTRA_SUBJECT, "First contact mail!");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });


    }
}