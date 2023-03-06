package com.example.traveling_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_about);

        Intent intent=new Intent();
        Button emailMe =(Button) findViewById(R.id.emailMe);
        Button visitHomepage =(Button) findViewById(R.id.visitHomepage);
        Button callMe =(Button) findViewById(R.id.callMe);

        emailMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setAction(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:A109221063@mail.shu.edu.tw"));
                intent.putExtra(Intent.EXTRA_SUBJECT,"[About Traveling]");
                startActivity(intent);
            }
        });

        visitHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://im.wp.shu.edu.tw"));
                startActivity(intent);
            }
        });

        callMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:0936637422"));
                startActivity(intent);
            }
        });
    }
}