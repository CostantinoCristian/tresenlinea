package com.example.tresenraya;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txt_1;
    ImageView b1,b2,b3,b4,b5,b6,b7,b8,b9;
    boolean turno=true;
    boolean ganador=false;
    int[] matrix= new int[9] ;
    Button b_comprobar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        txt_1 = (TextView) findViewById(R.id.txt_1);

        b1 = (ImageView) findViewById(R.id.b1);
        b2 = (ImageView) findViewById(R.id.b2);
        b3 = (ImageView) findViewById(R.id.b3);
        b4 = (ImageView) findViewById(R.id.b4);
        b5 = (ImageView) findViewById(R.id.b5);
        b6 = (ImageView) findViewById(R.id.b6);
        b7 = (ImageView) findViewById(R.id.b7);
        b8 = (ImageView) findViewById(R.id.b8);
        b9 = (ImageView) findViewById(R.id.b9);

        b_comprobar = (Button) findViewById(R.id.b_comprobar);
        b_comprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empate();
                ganador();
            }
        });

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        ImageView img = (ImageView) findViewById(v.getId());

            if (turno && (img.getDrawable()==null)) {
                switch (img.getId()){
                    case R.id.b1:
                        matrix[0]=1;
                        img.setImageResource(R.drawable.crox);
                        turno = false;
                        img.setEnabled(false);
                        break;
                    case R.id.b2:
                        matrix[1]=1;
                        img.setImageResource(R.drawable.crox);
                        turno = false;
                        img.setEnabled(false);
                        break;
                    case R.id.b3:
                        matrix[2]=1;
                        img.setImageResource(R.drawable.crox);
                        turno = false;
                        img.setEnabled(false);
                        break;
                    case R.id.b4:
                        matrix[3]=1;
                        img.setImageResource(R.drawable.crox);
                        turno = false;
                        img.setEnabled(false);
                        break;
                    case R.id.b5:
                        matrix[4]=1;
                        img.setImageResource(R.drawable.crox);
                        turno = false;
                        img.setEnabled(false);
                        break;
                    case R.id.b6:
                        matrix[5]=1;
                        img.setImageResource(R.drawable.crox);
                        turno = false;
                        img.setEnabled(false);
                        break;
                    case R.id.b7:
                        matrix[6]=1;
                        img.setImageResource(R.drawable.crox);
                        turno = false;
                        img.setEnabled(false);
                        break;
                    case R.id.b8:
                        matrix[7]=1;
                        img.setImageResource(R.drawable.crox);
                        turno = false;
                        img.setEnabled(false);
                        break;
                    case R.id.b9:
                        matrix[8]=1;
                        img.setImageResource(R.drawable.crox);
                        turno = false;
                        img.setEnabled(false);
                        break;
                }
            }else  if (!turno && img.getDrawable()==null){
                switch (img.getId()){
                    case R.id.b1:
                        matrix[0]=2;
                        img.setImageResource(R.drawable.cir);
                        turno = true;
                        img.setEnabled(false);
                        break;
                    case R.id.b2:
                        matrix[1]=2;
                        img.setImageResource(R.drawable.cir);
                        turno = true;
                        img.setEnabled(false);
                        break;
                    case R.id.b3:
                        matrix[2]=2;
                        img.setImageResource(R.drawable.cir);
                        turno = true;
                        img.setEnabled(false);
                        break;
                    case R.id.b4:
                        matrix[3]=2;
                        img.setImageResource(R.drawable.cir);
                        turno = true;
                        img.setEnabled(false);
                        break;
                    case R.id.b5:
                        matrix[4]=2;
                        img.setImageResource(R.drawable.cir);
                        turno = true;
                        img.setEnabled(false);
                        break;
                    case R.id.b6:
                        matrix[5]=2;
                        img.setImageResource(R.drawable.cir);
                        turno = true;
                        img.setEnabled(false);
                        break;
                    case R.id.b7:
                        matrix[6]=2;
                        img.setImageResource(R.drawable.cir);
                        turno = true;
                        img.setEnabled(false);
                        break;
                    case R.id.b8:
                        matrix[7]=2;
                        img.setImageResource(R.drawable.cir);
                        turno = true;
                        img.setEnabled(false);
                        break;
                    case R.id.b9:
                        matrix[8]=2;
                        img.setImageResource(R.drawable.cir);
                        turno = true;
                        img.setEnabled(false);
                        break;
                }

            }

        }
        public void ganador(){
            if (    (matrix[0]==1 && (matrix[0]==matrix[1]) && (matrix[1]==matrix[2])) || //linea horizontal
                    (matrix[3]==1 && (matrix[3]==matrix[4]) && (matrix[4]==matrix[5])) ||
                    (matrix[6]==1 && (matrix[6]==matrix[7]) && (matrix[7]==matrix[8])) ||

                    (matrix[0]==1 && (matrix[0]==matrix[3] && (matrix[3]==matrix[5]))) ||// lineas verticales
                    (matrix[1]==1 && (matrix[1]==matrix[4] && (matrix[4]==matrix[7]))) ||
                    (matrix[2]==1 && (matrix[2]==matrix[5] && (matrix[5]==matrix[8]))) ||

                    (matrix[0]==1 && (matrix[0]==matrix[4] && (matrix[4]==matrix[8]))) || //  cruzada
                    (matrix[2]==1 && (matrix[2]==matrix[4] && (matrix[4]==matrix[6])))
                                                                                         ){
                txt_1.setText("HA GANADO X");
                ganador=true;
                limpiar();

            } else if ( (matrix[0]==2 && (matrix[0]==matrix[1]) && (matrix[1]==matrix[2]))  || //lineas horizontales
                        (matrix[3]==2 && (matrix[3]==matrix[4]) && (matrix[4]==matrix[5])) ||
                        (matrix[6]==2 && (matrix[6]==matrix[7]) && (matrix[7]==matrix[8])) ||

                        (matrix[0]==2 && (matrix[0]==matrix[3] && (matrix[3]==matrix[5]))) ||// lineas verticales
                        (matrix[1]==2 && (matrix[1]==matrix[4] && (matrix[4]==matrix[7]))) ||
                        (matrix[2]==2 && (matrix[2]==matrix[5] && (matrix[5]==matrix[8]))) ||

                        (matrix[0]==2 && (matrix[0]==matrix[4] && (matrix[4]==matrix[8]))) || //  cruzada
                        (matrix[2]==2 && (matrix[2]==matrix[4] && (matrix[4]==matrix[6])))
                                                                                            ){
                txt_1.setText("HA GANADO O");
                ganador=true;
                limpiar();
            }


        }
        public void limpiar(){
            ganador=false;
            matrix[0] = 0;
            b1.setImageResource(0);
            b1.setEnabled(true);
            matrix[1] = 0;
            b2.setImageResource(0);
            b2.setEnabled(true);
            matrix[2] = 0;
            b3.setImageResource(0);
            b3.setEnabled(true);
            matrix[3] = 0;
            b4.setImageResource(0);
            b4.setEnabled(true);
            matrix[4] = 0;
            b5.setImageResource(0);
            b5.setEnabled(true);
            matrix[5] = 0;
            b6.setImageResource(0);
            b6.setEnabled(true);
            matrix[6] = 0;
            b7.setImageResource(0);
            b7.setEnabled(true);
            matrix[7] = 0;
            b8.setImageResource(0);
            b8.setEnabled(true);
            matrix[8] = 0;
            b9.setImageResource(0);
            b9.setEnabled(true);


        }
        public void empate() {
        ganador();
        if (!ganador) {
            if (    !(b1.getDrawable() ==null) &&
                    !(b2.getDrawable() ==null) &&
                    !(b3.getDrawable() ==null) &&
                    !(b4.getDrawable() ==null) &&
                    !(b5.getDrawable() ==null) &&
                    !(b6.getDrawable() ==null) &&
                    !(b7.getDrawable() ==null) &&
                    !(b8.getDrawable() ==null) &&
                    !(b9.getDrawable() ==null)) {
                txt_1.setText("Han empatado");
                limpiar();
        }}
}}