package com.counter.cole.buttonclickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private Button button;
    private TextView TextView;
    private int numTimesClicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.editText); // R = resources
        button = (Button) findViewById(R.id.button);
        TextView = (TextView) findViewById(R.id.textView);
        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {  
                numTimesClicked = numTimesClicked + 1;
                String result = "\nThe button got tapped " + numTimesClicked + " time";
                TextView.append(result);

            }
        };
        button.setOnClickListener(ourOnClickListener);
    }
}
