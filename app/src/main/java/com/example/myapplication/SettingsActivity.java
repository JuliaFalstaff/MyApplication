package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class SettingsActivity extends AppCompatActivity {

    private Button buttonTheme;
    private static final String appTheme = "APP_THEME";
    private static final String NameSharedPreference = "THEME";
    private static final int DefaultTheme = 0;
    private static final int LightTheme = 1;
    private static final int DarkTheme = 2;
    protected SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(getAppTheme(R.style.DefaultAppTheme));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        buttonTheme = findViewById(R.id.button_themes);
        buttonTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        initView();
    }

    private void initView() {
        RadioButton buttonLight = findViewById(R.id.radioButtonLightTheme);
        buttonLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAppTheme(LightTheme);
                recreate();
            }
        });
        RadioButton buttonDark = findViewById(R.id.radioButtonDarkTheme);
        buttonDark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAppTheme(DarkTheme);
                recreate();
            }
        });
        RadioButton buttonDefault = findViewById(R.id.radioButtonDefaultTheme);
        buttonDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAppTheme(DefaultTheme);
                recreate();
            }
        });
    }

    private int getAppTheme(int code) {
        return codeStyleToIdStyle(getCodeStyle(code));
    }

    private int codeStyleToIdStyle (int code){
        switch (code){
            case DarkTheme:
                return R.style.DarkAppTheme;
            case LightTheme:
                return R.style.LightAppTheme;
            case DefaultTheme:
            default:
                return R.style.DefaultAppTheme;
        }
    }

    private int getCodeStyle (int codeStyle) {
        sharedPreferences = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        return sharedPreferences.getInt(appTheme, codeStyle);
    }

    private void setAppTheme(int code){
        sharedPreferences = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        sharedPreferences.edit()
                .putInt(appTheme, code)
                .apply();
    }
}