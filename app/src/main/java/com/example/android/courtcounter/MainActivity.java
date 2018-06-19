package com.example.android.courtcounter;

import android.content.DialogInterface;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 int scoreA=0;
 int scoreB=0;
 int i=0;
 int j=0;
 String messageA;
 String messageB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void oneA(View view)
    {
        scoreA=scoreA+1;
         messageA=scoreA+"/"+i;
        display(messageA);
    }
    public void twoA(View view)
    {
        scoreA=scoreA+2;
        messageA=scoreA+"/"+i;
        display(messageA);
    }
    public void fourA(View view)
    {
        scoreA=scoreA+4;
         messageA=scoreA+"/"+i;
        display(messageA);    }
    public void sixA(View view)
    {
        scoreA=scoreA+6;
         messageA=scoreA+"/"+i;
        display(messageA);
    }
    public void outA(View view)
    {
        i=i+1;
        scoreA=scoreA;
         messageA=scoreA + " / "+ i;
        display(messageA);
    }
    public void oneB(View view)
    {
        scoreB=scoreB+1;
        messageB=scoreB+"/"+j;
        displayB(messageB);
    }
    public void twoB(View view)
    {
        scoreB=scoreB+2;
        messageB=scoreB+"/"+j;
        displayB(messageB);
    }
    public void fourB(View view)
    {
        scoreB=scoreB+4;
        messageB=scoreB+"/"+j;
        displayB(messageB);
    }
    public void sixB(View view)
    {
        scoreB=scoreB+6;
        messageB=scoreB+"/"+j;
        displayB(messageB);
    }
       public void outB(View view)
    {
        j=j+1;
        scoreB=scoreB+0;
       messageB=scoreB+"/"+j;
        displayB(messageB);
    }
      public void start(View view)
    {
        AlertDialog.Builder ad=new AlertDialog.Builder(this);
        ad.setMessage("Do You Want To Start Match");
        ad.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast t=Toast.makeText(MainActivity.this,"Match Started",Toast.LENGTH_LONG);
                t.show();
                scoreA=scoreA;
                messageA= scoreA+"/0";
                display(messageA);
                scoreB=scoreB;
                messageB=scoreB+"/0";
                displayB(messageB);
            }
        });
        ad.setPositiveButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                 dialog.cancel();
            }
        });
        ad.show();

    }

     public void reset(View view)
     {
         AlertDialog.Builder ad=new AlertDialog.Builder(this);
         ad.setMessage("Do You Want To Reset Match");
         ad.setNegativeButton("OK", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 Toast t=Toast.makeText(MainActivity.this,"Reset Done",Toast.LENGTH_LONG);
                 t.show();

                 scoreA=0;
                 scoreB=0;
                 i=0;
                 j=0;
                 messageA=scoreA+"/"+i;
                 messageB=scoreB+"/"+j;
                 displayB(messageB);
                 display(messageA);
             }
         });
         ad.setPositiveButton("CANCEL", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 dialog.cancel();
             }
         });
         ad.show();

      }
      public void display(String messageA)
      {
        TextView textView3=(TextView)findViewById(R.id.textView3);
        textView3.setText(messageA);
      }
    public void displayB(String messageB)
    {
        TextView textView4=(TextView)findViewById(R.id.textView4);
        textView4.setText(messageB);
    }

}