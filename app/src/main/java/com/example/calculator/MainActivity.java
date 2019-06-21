package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button a,s,m,d,c,help;
    EditText v1,v2,answer;
    public static final String answer_Is="com.example.calculator.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v1 = findViewById(R.id.editText);
        v2 = findViewById(R.id.editText2);
        answer = findViewById(R.id.answer);



        a = findViewById(R.id.add);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = v1.getText().toString();
                String value2 = v2.getText().toString();

                int num1 = Integer.parseInt(value1);
                int num2 = Integer.parseInt(value2);
                int sum = num1+num2;
                answer.setText("Answer is "+sum);
            }
        });

        s = findViewById(R.id.sub);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = v1.getText().toString();
                String value2 = v2.getText().toString();

                int num1 = Integer.parseInt(value1);
                int num2 = Integer.parseInt(value2);
                int sub = num1-num2;
                answer.setText("Answer is "+sub);
            }
        });
        m = findViewById(R.id.mul);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = v1.getText().toString();
                String value2 = v2.getText().toString();

                int num1 = Integer.parseInt(value1);
                int num2 = Integer.parseInt(value2);
                int mul = num1*num2;
                answer.setText("Answer is "+mul);
            }
        });

        d = findViewById(R.id.div);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = v1.getText().toString();
                String value2 = v2.getText().toString();

                int num1 = Integer.parseInt(value1);
                int num2 = Integer.parseInt(value2);
                int div = num1/num2;
                answer.setText("Answer is "+div);
            }
        });

        c = findViewById(R.id.clear);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1.setText("");
                v2.setText("");
                Toast.makeText(MainActivity.this, "Cleared All", Toast.LENGTH_SHORT).show();
            }
        });

        help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HelpActivity.class);
                String fn = answer.getText().toString();
                intent.putExtra(answer_Is,fn);
                startActivity(intent);
            }
        });


    }
}
