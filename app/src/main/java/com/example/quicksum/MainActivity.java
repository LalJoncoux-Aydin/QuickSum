package com.example.quicksum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void replaceResultText() {
        TextView textView = findViewById(R.id.sum);
        String result = "" + sum;
        textView.setText(result);
    }

    public void buttonClicked(View view) {
        Button button = (Button) view;

        int nb = Integer.parseInt(button.getText().toString());
        sum += nb;
        replaceResultText();
    }

    public void clearSum(View view) {
        sum = 0;
        replaceResultText();
    }
}