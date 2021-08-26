package com.tetraverge.shamimexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText texta,textb,textc;
    Button calcBtn;
    TextView calView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texta = (EditText) findViewById(R.id.atext);
        textb = (EditText) findViewById(R.id.btext);
        textc = (EditText) findViewById(R.id.ctext);
        calcBtn = (Button) findViewById(R.id.btn);
        calView = (TextView) findViewById(R.id.calculatext);

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a = String.valueOf(texta.getText());
                String b = String.valueOf(textb.getText());
                String c = String.valueOf(textc.getText());
                int cona = Integer.parseInt(a);
                int conb = Integer.parseInt(b);
                int conc = Integer.parseInt(c);

                int result = cona+conb+conc;
                calView.setText(Integer.toString(result));

            }
        });

    }
}