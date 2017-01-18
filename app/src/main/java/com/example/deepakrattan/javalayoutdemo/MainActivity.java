package com.example.deepakrattan.javalayoutdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        Button button = new Button(this);
        button.setText("Click Me");
        button.setBackgroundColor(Color.CYAN);
        button.setId(R.id.buttonID);

        EditText edtName = new EditText(this);
        edtName.setBackgroundColor(Color.GRAY);
        edtName.setHint("Enter your name");
        edtName.setId(R.id.edtID);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(Color.RED);

        RelativeLayout.LayoutParams buttonParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        RelativeLayout.LayoutParams edtParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        //Adding rules for button
        buttonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonParams.addRule(RelativeLayout.CENTER_VERTICAL);

        //Adding rules for edittext
        edtParams.addRule(RelativeLayout.ABOVE);
        edtParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        edtParams.setMargins(0,0,0,40);

        relativeLayout.addView(button, buttonParams);
        relativeLayout.addView(edtName, edtParams);

        setContentView(relativeLayout);


    }
}
