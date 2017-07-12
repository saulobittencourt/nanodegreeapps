package com.saulo.nanodegree.nanodegreeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        Button btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                Toast.makeText(this,"Esse botão irá executar o projeto Filmes Populares",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn2:
                Toast.makeText(this,"Esse botão irá executar o projeto Stock Hawk",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn3:
                Toast.makeText(this,"Esse botão irá executar o projeto Faça-o maior",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn4:
                Toast.makeText(this,"Esse botão irá executar o projeto Faça seu aplicativo com Material",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn5:
                Toast.makeText(this,"Esse botão irá executar o projeto Seja onipresente",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn6:
                Toast.makeText(this,"Esse botão irá executar o projeto Capstone",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
