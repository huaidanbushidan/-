package com.example.a32936.hhh;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double result = 0;
    double result1 ;
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
        Button buttonGEN = (Button) findViewById(R.id.buttonGEN);
        Button buttonPINGFANG = (Button) findViewById(R.id.buttonPINGFANG);
        Button buttonDAOSHU = (Button) findViewById(R.id.buttonDAOSHU);
        Button buttonQINGCHU = (Button) findViewById(R.id.buttonQINGCHU);
        Button buttonGUILING = (Button) findViewById(R.id.buttonGUILING);
        Button buttonSHANCHU = (Button) findViewById(R.id.buttonSHANCHU);
        Button buttonCHUYI = (Button) findViewById(R.id.buttonCHUYI);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button buttonCHENG = (Button) findViewById(R.id.buttonCHENG);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button buttonJIAN = (Button) findViewById(R.id.buttonJIAN);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button buttonJIA = (Button) findViewById(R.id.buttonJIA);
        Button buttonZHENGFU = (Button) findViewById(R.id.buttonZHENGFU);
        Button buttonLING = (Button) findViewById(R.id.buttonLING);
        Button buttonDIAN = (Button) findViewById(R.id.buttonDIAN);
        Button buttonDENGYU = (Button) findViewById(R.id.buttonDENGYU);
        final TextView TextView = (TextView) findViewById(R.id.tvResult);
        TextView.setText(str1);

       buttonDENGYU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op == 0){};
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
                        TextView.setText(String.valueOf(result));
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
                        TextView.setText(String.valueOf(result));
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
                        TextView.setText(String.valueOf(result));
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
                        TextView.setText(String.valueOf(result));
                    }
                }
                qian = result;
                xs = result;
                result = 0;
                str1 = "0";
                result1 += 1;
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
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
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        buttonLING.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        buttonJIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op == 0) {
                    op = 1;
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
                            TextView.setText(String.valueOf(result));
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
                            TextView.setText(String.valueOf(result));
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
                            TextView.setText(String.valueOf(result));
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
                            TextView.setText(String.valueOf(result));
                        }
                    }
                    qian = result;
                    xs = result;
                    result = 0;
                    str1 = "0";
                    result1 = 0;
                };
            }
        });
        buttonJIAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                            TextView.setText(String.valueOf(result));
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
                            TextView.setText(String.valueOf(result));
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
                            TextView.setText(String.valueOf(result));
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
                            TextView.setText(String.valueOf(result));
                        }
                    }
                    qian = result;
                    xs = result;
                    result = 0;
                    str1 = "0";
                    result1 = 0;
                };
            }
        });
        buttonCHENG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op == 0) {
                    op = 3;
                    qian = xs;
                    str1 = "";
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
                            TextView.setText(String.valueOf(result));
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
                            TextView.setText(String.valueOf(result));
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
                            TextView.setText(String.valueOf(result));
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
                            TextView.setText(String.valueOf(result));
                        }
                    }
                    qian = result;
                    xs = result;
                    result = 0;
                    str1 = "0";
                    result1 = 0;
                };
            }
        });
        buttonCHUYI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
                            TextView.setText(String.valueOf(result));
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
                            TextView.setText(String.valueOf(result));
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
                            TextView.setText(String.valueOf(result));
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
                            TextView.setText(String.valueOf(result));
                        }
                    }
                    qian = result;
                    xs = result;
                    result = 0;
                    str1 = "0";
                    result1 = 0;
                };
            }
        });
        buttonGUILING.setOnClickListener(new View.OnClickListener() {
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
        buttonDIAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (str1.equals("")){
                    str1 = "";
                }
                else if(str1.matches("[^\\.]*\\.[^\\.]*")){
                str1 = str1;
            }
                else {
                str1 = str1 + ".";
                }
                TextView.setText(str1);
                xs = Double.parseDouble(str1);
                result1 = 0;

            }
        });
        buttonGEN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qian = Double.parseDouble(str1);
                if (qian>=0){
                    qian = (Math.sqrt(qian));
                    if(qian%1 == 0)
                    {
                        int a = (int)qian;
                        TextView.setText(String.valueOf(a));
                        xs = a ;
                    }
                    else
                    {
                        TextView.setText(String.valueOf(qian));
                        xs = qian;
                    }
                }
                else{
                    TextView.setText("无效输入");
                    op = 0;
                    str1 =  "0";
                    qian = 0;
                    hou = 0;
                    xs = 0;
                    result = 0;
                }
                result1 = 0;
            }
        });
        buttonBAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(result != 0) {
                    result = result * result / 100;

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
        buttonZHENGFU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xs != 0){
                    xs = 0 - xs;
                    if(xs%1 == 0)
                    {
                        int a = (int)xs;
                        TextView.setText(String.valueOf(a));
                    }
                    else
                    {
                        TextView.setText(String.valueOf(xs));
                    }
                }
                qian = xs;
                result1 = 0;
            }
        });
        buttonPINGFANG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  xs = xs*xs;
                if(xs%1 == 0)
                {
                    int a = (int)xs;
                    TextView.setText(String.valueOf(a));
                }
                else
                {
                    TextView.setText(String.valueOf(xs));
                }
                qian = xs;
                result1 = 0;
            }
        });
        buttonQINGCHU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xs = 0;
                if(xs%1 == 0)
                {
                    int a = (int)xs;
                    TextView.setText(String.valueOf(a));
                }
                else
                {
                    TextView.setText(String.valueOf(xs));
                }
                result1 = 0;
            }
        });
        buttonSHANCHU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int len = str1.length();
                if(len>1) {
                    str1 = str1.substring(0, str1.length() - 1);
                    TextView.setText(str1);
                }
                if(len == 1){
                    str1 = "0";
                    TextView.setText(str1);
                }
                xs = xs = Double.parseDouble(str1);
            }
        });
    }
        public void setTextView() {
        TextView textView = (TextView) findViewById(R.id.tvResult);
        textView.setText(String.valueOf(result));
    }
}
