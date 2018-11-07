package com.example.akash.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bdiv,bdot,bmul,bteql,btnclear,bsqrt;
    TextView tv1;
    double v1,v2,input;
    boolean add,sub,mul,div,qrt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.bt1);
        b2 = (Button) findViewById(R.id.bt2);
        b3 = (Button) findViewById(R.id.bt3);
        b4 = (Button) findViewById(R.id.bt4);
        b5 = (Button) findViewById(R.id.bt5);
        b6 = (Button) findViewById(R.id.bt6);
        b7 = (Button) findViewById(R.id.bt7);
        b8 = (Button) findViewById(R.id.bt8);
        b9 = (Button) findViewById(R.id.bt9);
        b0 = (Button) findViewById(R.id.bt0);
        badd = (Button) findViewById(R.id.btnplus);
        bsub = (Button) findViewById(R.id.btnminus);
        bmul = (Button) findViewById(R.id.btnmulti);
        bdiv = (Button) findViewById(R.id.btndiv);
        bdot = (Button) findViewById(R.id.btpoint);
        bteql = (Button)findViewById(R.id.bteql);
        bsqrt = (Button) findViewById(R.id.btnroot);
        btnclear = (Button) findViewById(R.id.btnclr);

        tv1 = (TextView) findViewById(R.id.tv1);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        badd.setOnClickListener(this);
        bsub.setOnClickListener(this);
        bmul.setOnClickListener(this);
        bdiv.setOnClickListener(this);
        bdot.setOnClickListener(this);
        bteql.setOnClickListener(this);
        btnclear.setOnClickListener(this);
        bsqrt.setOnClickListener(this);

    }




    @Override
    public void onClick(View v){

        if (v.getId()==R.id.bt1){
            tv1.setText(tv1.getText()+"1");
        }
       else if (v.getId()==R.id.bt2){
            tv1.setText(tv1.getText()+"2");
        }
       else if (v.getId()==R.id.bt3){
            tv1.setText(tv1.getText()+"3");
        }
       else if (v.getId()==R.id.bt4){
            tv1.setText(tv1.getText()+"4");
        }
        else if (v.getId()==R.id.bt5){
            tv1.setText(tv1.getText()+"5");
        }
        else if (v.getId()==R.id.bt6){
            tv1.setText(tv1.getText()+"6");
        }
        else if (v.getId()==R.id.bt7){
            tv1.setText(tv1.getText()+"7");
        }
        else if (v.getId()==R.id.bt8){
            tv1.setText(tv1.getText()+"8");
        }
        else if (v.getId()==R.id.bt9){
            tv1.setText(tv1.getText()+"9");
        }
        else if (v.getId()==R.id.bt0){
            tv1.setText(tv1.getText()+"0");
        }
        else if (v.getId()==R.id.btpoint){
            tv1.setText(tv1.getText()+".");
        }
        else if (v.getId()==R.id.btnplus){
              v1 = Double.parseDouble(tv1.getText()+"");
              add = true;
              tv1.setText(null);
        }
        else if (v.getId()==R.id.btnminus){
            v1 = Double.parseDouble(tv1.getText()+"");
            sub = true;
            tv1.setText(null);
        }
        else if (v.getId()==R.id.btnmulti){
            v1 = Double.parseDouble(tv1.getText()+"");
            mul = true;
            tv1.setText(null);
        }

        else if (v.getId()==R.id.btnroot){
          //  input = Double.parseDouble()
            input = Double.parseDouble(tv1.getText().toString()+"");
            qrt = true;
            tv1.setText(null);
        }


        else if (v.getId()==R.id.btndiv){
            v1 = Double.parseDouble(tv1.getText()+"");
            div = true;
            tv1.setText(null);
        }
        else if (v.getId()==R.id.bteql) {
            v2 = Double.parseDouble(tv1.getText() + "");

            if (add == true) {
                tv1.setText(v1 + v2 + "");
                add = false;
            }
            if (sub == true) {
                tv1.setText(v1 - v2 + "");
                sub = false;
            }
            if (mul == true) {
                tv1.setText(v1 * v2 + "");
                mul = false;
            }
            if (div == true) {
                tv1.setText(v1 / v2 + "");
                div = false;

            }

            if (div == true) {
                tv1.setText(v1 / v2 + "");
                div = false;

            }
           if (qrt == true) {
                tv1.setText(Math.sqrt(input) + "");
                qrt = false;

            }

        }

        else if (v.getId()==R.id.btnclr){
            tv1.setText("");
        }


        else {
            tv1.setText("Execption Occurd");
        }


    }


}


