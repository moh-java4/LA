package com.example.la;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView textView1;
    private boolean changeFont = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView1 = findViewById(R.id.text_view1);

        //final Typeface t1 = ResourcesCompat.getFont(this, R.font.simonetta_black);
        //final Typeface t2 = ResourcesCompat.getFont(this, R.font.simonetta_regular);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (changeFont) {
                    //textView1.setTypeface(t1);
                    changeFont = false;
                } else {
                    //textView1.setTypeface(t2);
                    changeFont = true;
                }
            }
        });
    }
}