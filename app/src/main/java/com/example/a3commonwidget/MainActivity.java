package com.example.a3commonwidget;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;
    private EditText editText;
    private Button button;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private RadioButton radioButton1;
    private RadioButton radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.tv1);
        textView2 = (TextView) findViewById(R.id.tv2);
        editText = (EditText) findViewById(R.id.edittext1);
        button = (Button) findViewById(R.id.button1);
        checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        radioButton1 = (RadioButton) findViewById(R.id.rb1);
        radioButton2 = (RadioButton) findViewById(R.id.rb2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(button.getText());
            }
        });
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked()&&checkBox2.isChecked())
                    textView1.setText(checkBox2.getText()+"+"+checkBox1.getText());
                if(checkBox1.isChecked()&&!checkBox2.isChecked())
                    textView1.setText(checkBox1.getText());
            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked()&&checkBox2.isChecked())
                    textView1.setText(checkBox1.getText()+"+"+checkBox2.getText());
                if(!checkBox1.isChecked()&&checkBox2.isChecked())
                    textView1.setText(checkBox2.getText());
            }
        });

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButton1.isChecked())
                    textView2.setText(radioButton1.getText());
            }
        });
        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButton2.isChecked())
                    textView2.setText(radioButton2.getText());
            }
        });

    }
}
