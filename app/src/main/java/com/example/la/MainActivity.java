package com.example.la;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button buttonShowToast;
    private Button buttonWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonShowToast = findViewById(R.id.button_show_toast);
        buttonShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });

        Switch switchButton = findViewById(R.id.switch_button);
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    buttonShowToast.setEnabled(true);
                } else {
                    buttonShowToast.setEnabled(false);
                }
            }
        });

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        buttonWebView = findViewById(R.id.button_web_view);

        buttonWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebView();
            }
        });

    }

    public void openWebView() {
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void showToast() {
        StyleableToast.makeText(this, "Hello World!", R.style.exampleToast).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = new MenuInflater(this);
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                StyleableToast.makeText(this, "Item 1 Selected", R.style.exampleToast).show();
                return true;
            case R.id.item2:
                StyleableToast.makeText(this, "Item 2 Selected", R.style.exampleToast).show();
                return true;
            case R.id.item3:
                StyleableToast.makeText(this, "Item 3 Selected", R.style.exampleToast).show();
                return true;
            case R.id.subItem1:
                StyleableToast.makeText(this, "Sub Item 1 Selected", R.style.exampleToast).show();
                return true;
            case R.id.subItem2:
                StyleableToast.makeText(this, "Sub Item 2 Selected", R.style.exampleToast).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}