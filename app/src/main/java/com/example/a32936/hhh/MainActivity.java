package com.example.a32936.hhh;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double result = 0;
    double result1 = 0;
    double result2 = 0;    // 防止ce键重复操作
    double hou = 0;
    double qian = 0;
    double xs = 0;
    int op = 0;
    String str1 ="0";
    String str2 ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonBAI = (Button) findViewById(R.id.buttonBAI);
        Button BtnRooting = (Button) findViewById(R.id.BtnRooting);
        Button BtnSquare = (Button) findViewById(R.id.BtnSquare);
        Button BtnReciprocal = (Button) findViewById(R.id.BtnReciprocal);
        Button BtnCE = (Button) findViewById(R.id.BtnCE);
        Button BtnC = (Button) findViewById(R.id.BtnC);
        Button BtnBack = (Button) findViewById(R.id.BtnBack);
        Button BtnDivide = (Button) findViewById(R.id.BtnDivide);
        Button Btn7 = (Button) findViewById(R.id.Btn7);
        Button Btn8 = (Button) findViewById(R.id.Btn8);
        Button Btn9 = (Button) findViewById(R.id.Btn9);
        Button BtnMultiply = (Button) findViewById(R.id.BtnMultiply);
        Button Btn4 = (Button) findViewById(R.id.Btn4);
        Button Btn5 = (Button) findViewById(R.id.Btn5);
        Button Btn6 = (Button) findViewById(R.id.Btn6);
        Button BtnMinus = (Button) findViewById(R.id.BtnMinus);
        Button Btn1 = (Button) findViewById(R.id.Btn1);
        Button Btn2 = (Button) findViewById(R.id.Btn2);
        Button Btn3 = (Button) findViewById(R.id.Btn3);
        Button BtnPlus = (Button) findViewById(R.id.BtnPlus);
        Button BtnSign = (Button) findViewById(R.id.BtnSign);
        Button Btn0 = (Button) findViewById(R.id.Btn0);
        Button BtnPoint = (Button) findViewById(R.id.BtnPoint);
        Button BtnEqual = (Button) findViewById(R.id.BtnEqual);
        final TextView TextView = (TextView) findViewById(R.id.tvResult);
        TextView.setText(str1);

        BtnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op == 0){
                    result = xs;
                    if (result % 1 == 0) {
                        int a = (int) result;
                        TextView.setText(String.valueOf(a));//此处有改动
                        str1 = "" + a;
                    }
                    else {
                        DecimalFormat fnum = new DecimalFormat("#.################");
                        String d=fnum.format(result);
                        TextView.setText(String.valueOf(d));             //此处有改动
                        str1 = "" + d;
                    }}
                if (op == 1) {
                    if(result1 != 1) {     //防止重复点击等于按钮时变量hou翻倍
                        hou = xs;
                    }
                    result = qian + hou;
                    if (result % 1 == 0) {
                        int a = (int) result;
                        TextView.setText(String.valueOf(a));//此处有改动
                        str1 = "" + a;
                    }
                    else {
                        DecimalFormat fnum = new DecimalFormat("#.################");
                        String d=fnum.format(result);
                        TextView.setText(String.valueOf(d));             //此处有改动
                        str1 = "" + d;
                    }}
                if (op == 2) {
                    if(result1 != 1) {
                        hou = xs;
                    }
                    result = qian - hou;
                    if (result % 1 == 0) {
                        int a = (int) result;
                        TextView.setText(String.valueOf(a));
                        str1 = "" + a;
                    } else {
                        DecimalFormat fnum = new DecimalFormat("#.################");
                        String d=fnum.format(result);
                        TextView.setText(String.valueOf(d));
                        str1 = "" + d;
                    }
                }
                if (op == 3){
                    if(result1 != 1) {
                        hou = xs;
                    }
                    result = qian*hou;
                    if (result % 1 == 0) {
                        int a = (int) result;
                        TextView.setText(String.valueOf(a));
                        str1 = "" + a;
                    }
                    else {
                        DecimalFormat fnum = new DecimalFormat("#.################");
                        String d=fnum.format(result);
                        TextView.setText(String.valueOf(d));
                        str1 = "" + d;
                    }
                }
                if (op == 4){
                    if(result1 != 1) {
                        hou = xs;
                    }
                    if (hou == 0){
                        TextView.setText("除数不能为零");
                        str1 = "0";
                        op = 0;
                        result = 0;
                        qian = 0;
                        hou = 0;
                        result1 = 0;
                        xs = 0;                  //极少数xs与屏幕内容不一致的情况
                    }
                    else {
                        result = qian / hou;
                        if (result % 1 == 0) {
                            int a = (int) result;
                            TextView.setText(String.valueOf(a));
                            str1 = "" + a;
                        } else {
                            DecimalFormat fnum = new DecimalFormat("#.################");
                            String d=fnum.format(result);
                            TextView.setText(String.valueOf(d));
                            str1 = "" + d;
                        }
                    }xs = result;
                }
                qian = result;
                xs = result;
                result1 = 1;
            }
        });

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1 == 1||result1 == 6) {
                    str1 = "0";
                    op = 0;
                    result = 0;
                    qian = 0;
                    hou = 0;
                }
                if(str1.equals("0")){
                    str1 = "1";
                }
                else {
                    str1 = str1 + 1;
                }
                TextView.setText(str1);
                xs = Double.parseDouble(str1);
                result1 = 0;
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(result1 == 1||result1 == 6) {
                    str1 = "0";
                    op = 0;
                    result = 0;
                    qian = 0;
                    hou = 0;
                }
                if(str1.equals("0")){
                    str1 = "2";
                }
                else {
                    str1 = str1 + 2;
                }
                TextView.setText(str1);
                xs = Double.parseDouble(str1);
                result1 = 0;
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1 == 1||result1 == 6) {
                    str1 = "0";
                    op = 0;
                    result = 0;
                    qian = 0;
                    hou = 0;
                }
                if(str1.equals("0")){
                    str1 = "3";
                }
                else {
                    str1 = str1 + 3;
                }
                TextView.setText(str1);
                xs = Double.parseDouble(str1);
                result1 = 0;
            }

        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1 == 1||result1 == 6) {
                    str1 = "0";
                    op = 0;
                    result = 0;
                    qian = 0;
                    hou = 0;
                }
                if(str1.equals("0")){
                    str1 = "4";
                }
                else {
                    str1 = str1 + 4;
                }
                TextView.setText(str1);
                xs = Double.parseDouble(str1);
                result1 = 0;
            }

        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1 == 1||result1 == 6) {
                    str1 = "0";
                    op = 0;
                    result = 0;
                    qian = 0;
                    hou = 0;
                }
                if(str1.equals("0")){
                    str1 = "5";
                }
                else {
                    str1 = str1 + 5;
                }
                TextView.setText(str1);
                xs = Double.parseDouble(str1);
                result1 = 0;
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1 == 1||result1 == 6){
                    str1 = "0";
                    op = 0;
                    result = 0;
                    qian = 0;
                    hou = 0;
                }
                if(str1.equals("0")){
                    str1 = "6";
                }
                else {
                    str1 = str1 + 6;
                }
                TextView.setText(str1);
                xs = Double.parseDouble(str1);
                result1 = 0;
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1 == 1||result1 == 6) {
                    str1 = "0";
                    op = 0;
                    result = 0;
                    qian = 0;
                    hou = 0;
                }
                if(str1.equals("0")){
                    str1 = "7";
                }
                else {
                    str1 = str1 + 7;
                }
                TextView.setText(str1);
                xs = Double.parseDouble(str1);
                result1 = 0;
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1 == 1||result1 == 6) {
                    str1 = "0";
                    op = 0;
                    result = 0;
                    qian = 0;
                    hou = 0;
                }
                if(str1.equals("0")){
                    str1 = "8";
                }
                else {
                    str1 = str1 + 8;
                }
                TextView.setText(str1);
                xs = Double.parseDouble(str1);
                result1 = 0;
            }
        });
        Btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1 == 1||result1 == 6) {
                    str1 = "0";
                    op = 0;
                    result = 0;
                    qian = 0;
                    hou = 0;
                }
                if(str1.equals("0")){
                        str1 = "9";
                    }
                else {
                        str1 = str1 + 9;
                    }
                TextView.setText(str1);
                xs = Double.parseDouble(str1);
                result1 = 0;
                }
        });
        Btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1 == 1||result1 == 6) {
                    str1 = "0";
                    op = 0;
                    result = 0;
                    qian = 0;
                    hou = 0;
                }
                if (str1.equals("")|str1.equals("0") ){
                 str1 = "0";
               }
                else {
                    str1  = str1 + 0;
                }
                TextView.setText(str1);
                xs = Double.parseDouble(str1);
                result1 = 0;
            }
        });
        BtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1 == 1){
                    op = 1;
                    qian = xs;
                    str1 = "0";
                }
                else{
                if(result1 == 2){}
                else if(result1 == 3|result1 == 4|result1 == 5)op = 1;
                else {
                if(op != 0){
                    if (op == 1) {
                       if(result1 == 0) {
                            hou = xs;
                    }
                    result = qian + hou;
                    if (result % 1 == 0) {
                        int a = (int) result;
                        TextView.setText(String.valueOf(a));
                    } else {
                        DecimalFormat fnum = new DecimalFormat("#.################");
                        String d=fnum.format(result);
                        TextView.setText(String.valueOf(d));
                    }
                }
                if (op == 2) {
                    if(result1 == 0) {
                        hou = xs;
                    }
                    result = qian - hou;
                    if (result % 1 == 0) {
                        int a = (int) result;
                        TextView.setText(String.valueOf(a));
                    } else {
                        DecimalFormat fnum = new DecimalFormat("#.################");
                        String d=fnum.format(result);
                        TextView.setText(String.valueOf(d));
                    }
                }
                if (op == 3){
                    if(result1 == 0) {
                        hou = xs;
                    }
                    result = qian*hou;
                    if (result % 1 == 0) {
                        int a = (int) result;
                        TextView.setText(String.valueOf(a));
                    } else {
                        DecimalFormat fnum = new DecimalFormat("#.################");
                        String d=fnum.format(result);
                        TextView.setText(String.valueOf(d));
                    }
                }
                if (op == 4){
                    if(result1 == 0) {
                        hou = xs;
                    }
                    if (hou == 0)TextView.setText("除数不能为零");
                    else {
                        result = qian / hou;
                        if (result % 1 == 0) {
                            int a = (int) result;
                            TextView.setText(String.valueOf(a));
                        } else {
                            DecimalFormat fnum = new DecimalFormat("#.################");
                            String d=fnum.format(result);
                            TextView.setText(String.valueOf(d));
                        }
                    }
                }
                qian = result;
                xs = result;
                result = 0;
                    str1 = "0";
                op = 1;
                }
                if(op == 0) {
                    op = 1;
                    qian = xs;
                    str1 = "0";
                }}}
                result1 = 2;     //保证+按键多次操作无效
            }
        });
        BtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1 == 1){
                    op = 2;
                    qian = xs;
                    str1 = "0";
                }
                else{
                    if(result1 == 3){}
                    else if(result1 == 2|result1 == 4|result1 == 5)op = 2;
                  else{
                if (op == 0) {
                    op = 2;
                    qian = xs;
                    str1 = "0";
                }
                else if(op != 0){
                    if (op == 1) {
                        if(result1 == 0) {
                            hou = xs;
                        }
                        result = qian + hou;
                        if(result%1 == 0)
                        {
                            int a = (int)result;
                            TextView.setText(String.valueOf(a));
                        }
                        else
                        {
                            DecimalFormat fnum = new DecimalFormat("#.################");
                            String d=fnum.format(result);
                            TextView.setText(String.valueOf(d));
                        }
                    }
                    if (op == 2) {
                        if(result1 == 0) {
                            hou = xs;
                        }
                        result = qian - hou;
                        if(result%1 == 0)
                        {
                            int a = (int)result;
                            TextView.setText(String.valueOf(a));
                        }
                        else
                        {
                            DecimalFormat fnum = new DecimalFormat("#.################");
                            String d=fnum.format(result);
                            TextView.setText(String.valueOf(d));
                        }
                    }
                    if (op == 3){
                        if(result1 == 0) {
                            hou = xs;
                        }
                        result = qian*hou;
                        if(result%1 == 0)
                        {
                            int a = (int)result;
                            TextView.setText(String.valueOf(a));
                        }
                        else
                        {
                            DecimalFormat fnum = new DecimalFormat("#.################");
                            String d=fnum.format(result);
                            TextView.setText(String.valueOf(d));
                        }
                    }
                    if (op == 4){
                        if(result1 == 0) {
                            hou = xs;
                        }
                        result = qian/hou;
                        if(result%1 == 0)
                        {
                            int a = (int)result;
                            TextView.setText(String.valueOf(a));
                        }
                        else
                        {
                            DecimalFormat fnum = new DecimalFormat("#.################");
                            String d=fnum.format(result);
                            TextView.setText(String.valueOf(d));
                        }
                    }
                    qian = result;
                    xs = result;
                    result = 0;
                    str1 = "0";
                    op = 2;
                }}}
                result1 = 3;
            }
        });
        BtnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result1 == 1){
                    op = 3;
                    qian = xs;
                    str1 = "0";
                }
                else{
                if(result1 == 4){}
                else if(result1 == 3|result1 == 2|result1 == 5)op = 3;
                else{
                if(op == 0) {
                    op = 3;
                    qian = xs;
                    str1 = "0";
                }
                else if(op != 0){
                    if (op == 1) {
                        if(result1 == 0) {
                            hou = xs;
                        }
                        result = qian + hou;
                        if(result%1 == 0)
                        {
                            int a = (int)result;
                            TextView.setText(String.valueOf(a));
                        }
                        else
                        {
                            DecimalFormat fnum = new DecimalFormat("#.################");
                            String d=fnum.format(result);
                            TextView.setText(String.valueOf(d));
                        }
                    }
                    if (op == 2) {
                        if(result1 == 0) {
                            hou = xs;
                        }
                        result = qian - hou;
                        if(result%1 == 0)
                        {
                            int a = (int)result;
                            TextView.setText(String.valueOf(a));
                        }
                        else
                        {
                            DecimalFormat fnum = new DecimalFormat("#.################");
                            String d=fnum.format(result);
                            TextView.setText(String.valueOf(d));
                        }
                    }
                    if (op == 3){
                        if(result1 == 0) {
                            hou = xs;
                        }
                        result = qian*hou;
                        if(result%1 == 0)
                        {
                            int a = (int)result;
                            TextView.setText(String.valueOf(a));
                        }
                        else
                        {
                            DecimalFormat fnum = new DecimalFormat("#.################");
                            String d=fnum.format(result);
                            TextView.setText(String.valueOf(d));
                        }
                    }
                    if (op == 4){
                        if(result1 == 0) {
                            hou = xs;
                        }
                        result = qian/hou;
                        if(result%1 == 0)
                        {
                            int a = (int)result;
                            TextView.setText(String.valueOf(a));
                        }
                        else
                        {
                            DecimalFormat fnum = new DecimalFormat("#.################");
                            String d=fnum.format(result);
                            TextView.setText(String.valueOf(d));
                        }
                    }
                    qian = result;
                    xs = result;
                    result = 0;
                    str1 = "0";
                    op = 3;
                }}}
                result1 = 4;;
            }
        });
        BtnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result1 == 1){
                    op = 4;
                    qian = xs;
                    str1 = "0";
                }
                else{
                if(result1 == 5){}
                else if(result1 == 3|result1 == 4|result1 == 2)op = 4;
                else{
                if(op == 0) {
                    op = 4;
                    qian = xs;
                    str1 = "0";
                }
                else if(op != 0){
                    if (op == 1) {
                        if(result1 == 0) {
                            hou = xs;
                        }
                        result = qian + hou;
                        if(result%1 == 0)
                        {
                            int a = (int)result;
                            TextView.setText(String.valueOf(a));
                        }
                        else
                        {
                            DecimalFormat fnum = new DecimalFormat("#.################");
                            String d=fnum.format(result);
                            TextView.setText(String.valueOf(d));
                        }
                    }
                    if (op == 2) {
                        if(result1 == 0) {
                            hou = xs;
                        }
                        result = qian - hou;
                        if(result%1 == 0)
                        {
                            int a = (int )result;
                            TextView.setText(String.valueOf(a));
                        }
                        else
                        {
                            DecimalFormat fnum = new DecimalFormat("#.################");
                            String d=fnum.format(result);
                            TextView.setText(String.valueOf(d));
                        }
                    }
                    if (op == 3){
                        if(result1 == 0) {
                            hou = xs;
                        }
                        result = qian*hou;
                        if(result%1 == 0)
                        {
                            int a = (int)result;
                            TextView.setText(String.valueOf(a));
                        }
                        else
                        {
                            DecimalFormat fnum = new DecimalFormat("#.################");
                            String d=fnum.format(result);
                            TextView.setText(String.valueOf(d));
                        }
                    }
                    if (op == 4){
                        if(result1 == 0) {
                            hou = xs;
                        }
                        result = qian/hou;
                        if(result%1 == 0)
                        {
                            int a = (int)result;
                            TextView.setText(String.valueOf(a));
                        }
                        else
                        {
                            DecimalFormat fnum = new DecimalFormat("#.################");
                            String d=fnum.format(result);
                            TextView.setText(String.valueOf(d));
                        }
                    }
                    qian = result;
                    xs = result;
                    result = 0;
                    str1 = "0";
                    op = 4;
                }}}
                result1 =5;
            }
        });
        BtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str1 = "0";
                op = 0;
                result = 0;
                qian = 0;
                hou = 0;
                TextView.setText(str1);
                xs = Double.parseDouble(str1);
                result1 = 0;
            }
        });
        BtnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str1.equals("0")||result1 != 0){
                    str1 = "0.";
                }
                else if(str1.matches("[^\\.]*\\.[^\\.]*")){}
                else {
                str1 = str1 + ".";
                }
                TextView.setText(str1);
                xs = Double.parseDouble(str1);
                result1 = 0;
            }
        });
        BtnRooting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (xs>=0){
                    xs = (Math.sqrt(xs));
                    if(xs%1 == 0)
                    {
                        int a = (int)xs;
                        TextView.setText(String.valueOf(a));
                        xs = a ;
                    }
                    else
                    {
                        DecimalFormat fnum = new DecimalFormat("#.################");
                        String d=fnum.format(xs);
                        TextView.setText(String.valueOf(d));
                    }
                    if(qian == 0)qian = xs;
                    else hou = xs;
                    str1 = xs + "";
                    result1 = 6;
                }
                else{
                    TextView.setText("无效输入");
                    op = 0;
                    str1 =  "0";
                    qian = 0;
                    hou = 0;
                    xs = 0;
                    result = 0;
                qian = xs;
                result1 = 0;
            }}
        });
        buttonBAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(op != 0) {
                    if(qian != xs)  xs = qian * xs / 100;
                    else xs = xs * xs / 100;
                    hou = xs;
                    if (xs % 1 == 0) {
                        int a = (int) xs;
                        TextView.setText(String.valueOf(a));
                    } else {
                        str1 = xs + "";
                        TextView.setText(String.valueOf(xs));
                    }
                }
                    else {
                    str1 = "0";
                    qian = 0;
                    hou = 0;
                    if (result % 1 == 0) {
                        int a = (int) result;
                        TextView.setText(String.valueOf(a));
                    } else {
                        str1 = "0";
                        qian = 0;
                        hou = 0;
                        TextView.setText(String.valueOf(result));
                    }
                }
                result1 = 0;
            }
        });
        BtnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result1 == 2||result1 == 3||result1 == 4||result1 == 5){
                    if(xs%1 == 0)
                    {
                        int a = (int)xs;
                        TextView.setText(String.valueOf(a));
                        str1 = a +"";
                    }
                    else
                    {
                        DecimalFormat fnum = new DecimalFormat("#.################");
                        String d=fnum.format(xs);
                        TextView.setText(String.valueOf(d));
                        str1 = d +"";
                    }}
                if(str1 != "0"){
                    if(str1.contains("-"))  str1 = str1.replaceAll("-","" );
                    else  str1 = "-".concat(str1);
                    TextView.setText(str1);
                }
                else if(xs == 0&&str1.matches("[^\\.]*\\.[^\\.]*")){
                    if(str1.contains("-"))  str1 = str1.replaceAll("-","" );
                    else  str1 = "-".concat(str1);
                    TextView.setText(str1);
                }
                xs = Double.parseDouble(str1);
                if(result1 == 1)qian = xs;
            }
        });
        BtnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  xs = xs*xs;
                if (xs % 1 == 0) {
                    int a = (int) xs;
                    TextView.setText(String.valueOf(a));
                    str1 = a+ "";
                } else {
                    DecimalFormat fnum = new DecimalFormat("#.################");
                    String d=fnum.format(xs);
                    TextView.setText(String.valueOf(d));
                }
                qian = xs;
                result1 = 6;
            }
        });
        BtnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result1 == 1){
                    qian = 0;
                }
                else{
                    if(hou != 0) hou = 0;
                else qian = 0;}
                    str1 = "0";
                    TextView.setText(str1);
                    xs = Double.parseDouble(str1);
            }
        });
        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result1 != 0){}
                else {
                    int len = str1.length();
                    if (len > 3) {
                        str1 = str1.substring(0, str1.length() - 1);
                        TextView.setText(str1);
                    }
                    else if(len == 3){
                       if(xs == 0&&str1.contains("-"))str1 = "0";
                       else str1 = str1.substring(0, str1.length() - 1);
                        TextView.setText(str1);}
                    else if (len == 2) {
                        if (str1.contains("-")) str1 = "0";
                        else str1 = str1.substring(0, str1.length() - 1);
                        TextView.setText(str1);
                    } else if (len == 1) {
                        str1 = "0";
                        TextView.setText(str1);
                    }
                    xs = Double.parseDouble(str1);
                }
            }
        });
        BtnReciprocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xs == 0) TextView.setText("除数不能为零");
                else {
                    xs = 1/xs;
                    if(xs%1 == 0)
                    {
                        int a = (int)xs;
                        TextView.setText(String.valueOf(a));
                    }
                    else
                    {
                        TextView.setText(String.valueOf(xs));
                    }
                    result1 = 6;                   //防止运算结果被退格键删除
                }
            }
        });
    }
        public void setTextView() {
        TextView textView = (TextView) findViewById(R.id.tvResult);
        textView.setText(String.valueOf(result));
    }
}
