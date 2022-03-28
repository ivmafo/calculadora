package com.umb.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma ;
    private Button btn_resta ;
    private Button btn_multiplicacion;
    private Button btn_division ;
    private TextView text_respuesta ;
    private EditText edit_numero1 ;
    private EditText edit_numero2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_suma = findViewById(R.id.buttonSuma) ;
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               text_respuesta.setText( suma( Integer.parseInt(edit_numero1.getText().toString()) ,
                                             Integer.parseInt(edit_numero2.getText().toString())
                                           ) +""
                                      );
            }
        });
        btn_resta = findViewById(R.id.buttonResta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText( resta( Integer.parseInt(edit_numero1.getText().toString()) ,
                        Integer.parseInt(edit_numero2.getText().toString())
                        ) +""
                );
            }
        });
        btn_multiplicacion = findViewById(R.id.buttonMultiplicacion) ;
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText( multiplicacion( Integer.parseInt(edit_numero1.getText().toString()) ,
                        Integer.parseInt(edit_numero2.getText().toString())
                        ) +""
                );
            }
        });
        btn_division = findViewById(R.id.buttonDivision) ;
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText( division( Integer.parseInt(edit_numero1.getText().toString()) ,
                        Integer.parseInt(edit_numero2.getText().toString())
                        ) +""
                );
            }
        });
        text_respuesta = findViewById(R.id.respuesta) ;
        edit_numero1 = findViewById(R.id.numero1) ;
        edit_numero2 = findViewById(R.id.numero2) ;

    }

    public int suma(int a , int b){
        return a + b ;
    }
    public int resta(int a , int b){
        return a - b ;
    }
    public int multiplicacion(int a , int b){
        return a * b ;
    }public int division(int a , int b){
        if (b == 0) {
            return 0 ;
        } else {
            return a / b;
        }
    }
}