

/* Group Members

NAME OF STUDENTS           ID NUMBER
 
1 NIGAT ABIRAHAM           NaScER/0186/13 
2 REDELA ANULO            NaScER/0196/13 
3 DANIEL GENETI          NaScER/0065/13 
4 TAMIRAT AYANA           NaScER/0217/13 
*/











package com.example.simpleyetcalculator;

import com.example.simpleyetcalculator.R;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView AnswerTextView, fristTextView, secondTextView;
    EditText firstEdittext, secondEditText;
    int num1, num2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        AnswerTextView = (TextView) findViewById(R.id.textViewAnswer);
        fristTextView = (TextView) findViewById(R.id.textViewFirst);
        secondTextView = (TextView) findViewById(R.id.textViewSecond);
        firstEdittext = (EditText) findViewById(R.id.editTextFirst);
        secondEditText = (EditText) findViewById(R.id.editTextSecond);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

    }

    public int getnumbers(EditText editText) {
        if (editText.getText().toString().equals(" ")) {
            Toast.makeText(this, "please enter number", Toast.LENGTH_SHORT).show();
            return 0;
        } else {


            return Integer.parseInt(editText.getText().toString());

        }
    }

    @Override
    public void onClick(View view) {
        num1 = getnumbers(firstEdittext);
        num2 = getnumbers(secondEditText);
        switch (view.getId()) {

            case R.id.btnAdd:
                AnswerTextView.setText("answer is" + (num1 + num2));
                break;
            case R.id.btnSub:
                AnswerTextView.setText("answer is" + (num1 - num2));
                break;
            case R.id.btnMul:
                AnswerTextView.setText("answer is" + (num1 * num1));
                break;
            case R.id.btnDiv:
                AnswerTextView.setText("answer is" + (num1 / num2));
                break;
        }
    }
}